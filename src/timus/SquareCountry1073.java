package timus;

import java.util.Scanner;

public class SquareCountry1073 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int area=sc.nextInt();
		int[]arr=new int[area+1];
		arr[0]=0;
		arr[1]=1;
		int noofCert;
		//greedy does not work. example 72
		noofCert=find(area,arr);

		System.out.println(noofCert);
	}

	private static int find(int area, int[]arr) {
		if(arr[area]!=0) return arr[area];
		if(Math.sqrt(area)==(int)Math.sqrt(area)) {
			arr[area]=1;
			return 1;
		}
		int i=1,j=1,rest,min=area;
		while(i<area) {
			rest=find(area-i,arr);
			min=rest+1>=min?min:rest+1;
			j++;
			i=j*j;
		}
		arr[area]=min;
		return min;
	}

}
