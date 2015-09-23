package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class AplusB {

	public static void main(String[] args) {
		int a,b;
   Scanner sc=new Scanner(System.in);
   a=sc.nextInt();
   b=sc.nextInt();
   PrintWriter pw=new PrintWriter(System.out);
   pw.println(a+b);
   pw.flush();
	}

}
