package timus;

import java.util.ArrayList;
import java.util.Scanner;

public class productOfDigits1014 {
	static ArrayList<Integer> digits=new ArrayList<>();
	
	static int leastMultiple=1;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		if(n==0) {
			digits.add(0);
			digits.add(1);
		}
		else {
		findDigits(n);
		}
		for(int x=digits.size();x>0;x--) {
			System.out.print(digits.get(x-1));
		}
	}
	private static void findDigits(int n) {
	 int flag=1;
		if(n<10) {
			digits.add(n);
			return;
		}
		else {
			for(int i=9;i>1;i--) {
				if(n%i==0) {
					leastMultiple=i;
					digits.add(leastMultiple);
					flag=0;
					break;
				}

			}
			if(flag==1) {
				System.out.println(-1);
				System.exit(0);
			}
			findDigits(n/leastMultiple);
		}
	}

}
