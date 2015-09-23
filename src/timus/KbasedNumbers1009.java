package timus;

import java.util.Scanner;

public class KbasedNumbers1009 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int result=findNumbers(n,k);
		System.out.println(result);
	}

	private static int findNumbers(int n, int k) {
		if(n==1) return k-1;
		if(n==2) return k*(k-1);
		
		return findNumbers(n-2, k)*(k-1)+findNumbers(n-1, k)*(k-1);
	}

}
