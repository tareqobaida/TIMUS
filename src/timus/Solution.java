package timus;

import java.io.*;
import java.util.Scanner;
public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    	
    	Scanner sc=new Scanner(System.in);
    	int size=sc.nextInt();
    	String[] arr=new String[size];
    	int i=0;
    	while(sc.hasNextLine()) {
    		arr[i]=sc.nextLine();
    		i++;
    		
    	}
    	String temp;
    	int year,month,day;
    	for(int k=0;k<size;k++) {
    		temp=arr[k];
    		String[] tempstr=temp.split(" ");
    		year=Integer.parseInt(tempstr[2]);
    		switch (tempstr[1]) {
    		case "Jan" :month=1;
    		break;
    		case "Feb" :month=2;
    		break;
    		case "Mar" :month=3;
    		break;
    		case "Apr" :month=4;
    		break;
    		case "May" :month=5;
    		break;
    				
    		}
    		
    		day=Integer.parseInt(tempstr[0].charAt(0));
    		System.out.println(year+);
    			
    	}
    	
    }
}