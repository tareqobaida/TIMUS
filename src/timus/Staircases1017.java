package timus;


import java.util.Scanner;

/**
 * @author Obaida
 * tricky problem, solve by DP
 * f(n,j)=f(n-j,j+1)+f(n,j+1), n=no of bricks, j=no of bricks in step
 * f(n,j)= no of combination where each step has at least j bricks.
 * f(n-j,j+1) if step with j bricks is taken
 * f(n,j+1) if step with j is not taken
 * for example n=5. then we can have steps 1,2,3,4,5
 * we may take j=1 or not. then we may take j=2 or not and so on..
 * finally f(n,1) will give the result.
 *
 */
public class Staircases1017 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long[][] arr=new long[n+1][n+1];
		long x;
		//if j=n, possible combination is 1
		for(int i=0;i<=n;i++) {
			arr[i][i]=1;
		}
		// bottom up, in our formula j value is increasing, we need higher value j to get lower value j
		//start with higher value j. 
		for(int i=1;i<=n;i++) {
			for(int j=i-1;j>=0;j--) { //highest of j=i-1, because we already know the value when j=i
				arr[i][j]=arr[i-j][j+1]+arr[i][j+1];
				
			}
		}
		System.out.println(arr[n][1]-1); //-1 because we need at least 2 steps. steps of size n is not allowed 
	}

}
