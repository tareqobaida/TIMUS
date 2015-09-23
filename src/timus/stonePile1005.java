package timus;

import java.util.Arrays;
import java.util.Scanner;
//variation of 0-1 knapsack problem
//https://www.youtube.com/watch?v=EH6h7WA7sDw
//http://www.geeksforgeeks.org/dynamic-programming-set-10-0-1-knapsack-problem/
public class stonePile1005 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] stones=new int[n];
int k=0;
int sum=0;
while(sc.hasNextInt()) {
	stones[k]=sc.nextInt();
	sum+=stones[k];
	k++;
}
//will find the items, whose summation is closest to halfsum. So difference between
//two piles will be minimum
int halfSum=sum/2;
int closestHalfSum=findPiles2(halfSum, stones, n);
System.out.println(sum-2*closestHalfSum);

	}
	public static int findPiles(int halfSum, int[]stones, int n) {
		//build the 2-d table of capacity and item upto ith. in bottom up manner
		int[][] record=new int[halfSum+1][n+1];
		for(int i=0;i<=n;i++) {
			for(int capacity=0;capacity<=halfSum;capacity++) {
				if(i==0 || capacity==0) {
					record[capacity][i]=0;
				}
				else if(stones[i-1]<=capacity) {
					record[capacity][i]=Math.max(record[capacity-stones[i-1]][i-1]+stones[i-1], record[capacity][i-1]);
					
				}
				else {
					record[capacity][i]=record[capacity][i-1];
				}
			}
		}
		
		return record[halfSum][n];
		
	}
	
	//better memory use version
	public static int findPiles2(int halfSum, int[]stones, int n) {
		//build the 2-d table of capacity and item upto ith. in bottom up manner
		int[][] record=new int[halfSum+1][2];
		int previous=0,current=1,temp;
		for(int i=0;i<=n;i++) {
			temp=previous;
			previous=current;
			current=temp;
			
			for(int capacity=0;capacity<=halfSum;capacity++) {
				if(i==0 || capacity==0) {
					record[capacity][previous]=0;
					record[capacity][current]=0;
				}
				else if(stones[i-1]<=capacity) {
					record[capacity][current]=Math.max(record[capacity-stones[i-1]][previous]+stones[i-1], record[capacity][previous]);
					
				}
				else {
					record[capacity][current]=record[capacity][previous];
				}
			}
		}
		
		return record[halfSum][current];
		
	}

}
