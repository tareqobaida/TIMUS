package timus;

import java.util.Scanner;

public class LuckyTickets1044 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=getCount(n);
		System.out.println(count);
	}

	private static int getCount(int n) {
		int temp,max,mid,rightSum = 0,leftSum = 0,count=0;
		max=(int) (Math.pow(10, n)-1); // maximum number of n digits
		mid=n/2; //mid digit
		if(n%2!=0 || n>9) return 1;
		for(int i=0;i<=max;i++) {
			temp=i;
			rightSum=0;
			leftSum=0;
			for(int j=1;j<=mid;j++) { //get the half  digits from right
				rightSum+=temp%10;
				temp/=10;
				}
			for(int j=mid+1;j<=n;j++) {//get the half of digits after mid
				leftSum+=temp%10;
				temp/=10;
				}
			if(leftSum==rightSum) count++;
		}
		
		
		return count;
	}

}
