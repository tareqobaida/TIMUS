package timus;

import java.math.BigInteger;
import java.util.Scanner;

public class KbasedNumberVtwo1012 {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		BigInteger[]arr=new BigInteger[n];
		BigInteger result=findNumbers(n,k,arr);
		System.out.println(result);
	}

	private static BigInteger findNumbers(int n, int k,BigInteger[] arr) {
		if(n==1) return new BigInteger(Integer.toString(k-1));
		if(n==2) return new BigInteger(Integer.toString(k*(k-1)));
		if(arr[n-1]!=null) return arr[n-1];
		BigInteger x;
		
		x=findNumbers(n-2, k,arr).multiply(new BigInteger(Integer.toString(k-1))).add(findNumbers(n-1, k,arr).multiply(new BigInteger(Integer.toString(k-1))));
		arr[n-1]=x;
		return arr[n-1];
	}



}
