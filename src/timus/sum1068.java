package timus;

import java.util.Scanner;

public class sum1068 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nn=Math.abs(n);
		if(nn<=10000) {
		if(n>0 ) {
			System.out.println(n*(n+1)/2);
		}
		else {
			System.out.println(1-(nn*(nn+1)/2));
		}
		}
		

	}

}
