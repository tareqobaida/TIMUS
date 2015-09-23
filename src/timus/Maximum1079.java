package timus;

import java.util.ArrayList;
import java.util.Scanner;

public class Maximum1079 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> numbers=new ArrayList<>();
		int x;
		while(sc.hasNextInt()) {
			x=sc.nextInt();
			if(x==0) {
				break;
			}
			else {
				numbers.add(x);
			}
		}
		
		for(int number:numbers) {
			findMax(number);
		}
	}

	private static void findMax(int n) {
		if(n==0) {
			System.out.println(0);
			return;
		}
		if(n==1) {
			System.out.println(1);
			return;
		}
		
		int[] results=new int[n+1];
		results[0]=0;
		results[1]=1;
		int max=0;
		for(int i=2;i<=n;i++) {
			if(i%2==0) {
				results[i]=results[i/2];
				max=max>results[i]?max:results[i];
			}
			else {
				results[i]=results[(int) Math.floor(i/2)]+results[(int) Math.floor(i/2)+1];
				max=max>results[i]?max:results[i];
			}
		}
		System.out.println(max);	
		
	}

}
