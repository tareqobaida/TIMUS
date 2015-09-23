package timus;

import java.util.Arrays;
import java.util.Scanner;

public class SacramentoftheSum1021 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size1=sc.nextInt();
		int[] list1=new int[size1];
		for(int i=0;i<size1;i++) {
			list1[i]=sc.nextInt();
		}
		int temp;
		int flag=0;
		int size2=sc.nextInt();
		for(int i=0;i<size2;i++) {
		temp=sc.nextInt();
		if((Arrays.binarySearch(list1,10000-temp))>=0) {
			System.out.println("YES");
			flag=1;
			break;
		}
		}
		if(flag==0) System.out.println("NO");
	}

}
