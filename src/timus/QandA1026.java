package timus;

import java.util.Arrays;
import java.util.Scanner;

public class QandA1026 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int size1=sc.nextInt();
int[] databases=new int[size1];
for(int i=0;i<size1;i++) {
	databases[i]=sc.nextInt();
}
String x=sc.nextLine();// two line escape is necessary 
 x=sc.nextLine();
int size2=sc.nextInt();
Arrays.sort(databases);
int k;
while(sc.hasNextInt()) {
	k=sc.nextInt();
	System.out.println(databases[k-1]);
}
	}

}
