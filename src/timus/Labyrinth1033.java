package timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Labyrinth1033 {
	 static HashMap<Integer, Boolean> visited=new HashMap<>();
	public static void main(String[] args) throws IOException {
		double start=System.currentTimeMillis();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		String tempstr;
		char[][] data=new char[n][n];
		char[] row;
		int i=0;
		while(i<n) {
			tempstr=br.readLine();
			row=tempstr.toCharArray();
			data[i]=row;
			i++;
		}
		br.close();
double mid=System.currentTimeMillis();	
System.out.println("time in ms readin="+ (mid-start));
		//create graph
		HashMap<Integer, ArrayList<Integer>> graph=new HashMap<>();
		for(i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(data[i][j]=='#') continue;
				ArrayList<Integer> neighbors=new ArrayList<>();
				if(i-1>=0 && data[i-1][j]=='.') neighbors.add((i-1)*n+j);// every row has n nodes. 
				if(i+1<n && data[i+1][j]=='.') neighbors.add((i+1)*n+j);
				if(j-1>=0 && data[i][j-1]=='.') neighbors.add(i*n+j-1);
				if(j+1<n && data[i][j+1]=='.') neighbors.add(i*n+j+1);
				graph.put(i*n+j, neighbors);
			}
		}
		
		BFS(graph,0);
		int exit=n*n-1;
		if(visited.get(exit)==null) {
			BFS(graph,exit);
		}
		Set<Integer> nodes=visited.keySet();
		int wall=0;
		for(int k:nodes) {
			wall+=(4-graph.get(k).size());  // dont have wall on neighbor side
		}
		System.out.println(wall*9-36); //entry and exit dont have wall on 2 sides 2*2*9=36
		double end=System.currentTimeMillis();
		System.out.println("time in ms="+ (end-start));
	}

	private static void BFS(HashMap<Integer, ArrayList<Integer>> graph, int s) {
		int node;
		ArrayList<Integer> neighbors=new ArrayList<>();
		Queue<Integer> queue=new LinkedList<Integer>();
		queue.add(s);
		while(!queue.isEmpty()) {
			node=queue.remove();
			visited.put(node, true);
			neighbors=graph.get(node);
			for(int neighbor:neighbors) {
				if(visited.get(neighbor)==null) queue.add(neighbor);
			}
			
			
		}
		
	}

}
