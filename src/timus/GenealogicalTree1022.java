package timus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GenealogicalTree1022 {
	static ArrayList<ArrayList<Integer>> inputs=new ArrayList<>();
	static int[] visitedbyFinishTime;
	static HashMap<Integer,Boolean> grayMap=new HashMap<Integer,Boolean>();
	static int time=0;
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
visitedbyFinishTime=new int[size];
ArrayList<Integer> children=new ArrayList<>();
int temp;
while(sc.hasNextInt()) {
	temp=sc.nextInt();
	if(temp==0) {
		inputs.add(children);
		children=new ArrayList<>();
	}
	else {
		children.add(temp-1);
	}

}
//DFS
for(int k=0;k<size;k++) {
	if(grayMap.get(k)==null) DFS(k);
}


for(int m=size-1;m>=0;m--) {
	System.out.print(visitedbyFinishTime[m]+1+" ");
}
	}
	
	private static void DFS(int vertex) {
		grayMap.put(vertex, true);
		for(int neighbor:inputs.get(vertex)) {
			if(grayMap.get(neighbor)==null) DFS(neighbor);
		}
		
		visitedbyFinishTime[time]=vertex;
		time++;
		
	}
	


}
