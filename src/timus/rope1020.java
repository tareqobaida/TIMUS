package timus;

import java.util.Scanner;

public class rope1020 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double r=sc.nextDouble();
		double perimeter=2*Math.PI*r;
		float[][] coords=new float[n][2];
		int k=0;
		double lenght=0;
		double x1,x2;
		while(sc.hasNextFloat()) {
			coords[k][0]=sc.nextFloat();
			coords[k][1]=sc.nextFloat();
			k++;
		}
		for(int i=0;i<n;i++) {
			if(i==n-1) {
				x1=Math.pow(coords[i][0]-coords[0][0], 2);
				x2=Math.pow(coords[i][1]-coords[0][1], 2);
			}
			else {
				x1=Math.pow(coords[i][0]-coords[i+1][0], 2);
				x2=Math.pow(coords[i][1]-coords[i+1][1], 2);
			}
			lenght+=Math.sqrt(x1+x2);
		}
		System.out.printf("%.2f",lenght+perimeter);
		
	}

}
