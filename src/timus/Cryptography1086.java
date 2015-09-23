package timus;

import java.util.Arrays;
import java.util.Scanner;

public class Cryptography1086 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		int k=0,max=0,temp;
		while(sc.hasNextInt()) {
			temp=sc.nextInt();
			arr[k]=temp;
			if(temp>max) max=temp;
			k++;
		}
		
		int[] primes=new int[max];
		primes[0]=2;
		int n=3,j=1;
		while(primes[max-1]==0) {
			if(isPrime(n,primes)) {
				primes[j]=n;
				j++;
			}
			n+=2;
			
		}
		
		for(int m=0;m<size;m++) {
			System.out.println(primes[arr[m]-1]);
		}
	}

	private static boolean isPrime(int n, int[] primes) {
		for(int i=0;primes[i]<=Math.sqrt(n);i++) {
			if(n%primes[i]==0) return false;
		}
		return true;
	}

}
