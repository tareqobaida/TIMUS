package timus;

import java.util.Scanner;

public class GoatintheGardern1084 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
double a=sc.nextDouble();
double r=sc.nextDouble();
double area=0,extraArea,angle,d;
if(r>=Math.sqrt(2)*a/2) {
	area=a*a;
}
else if(r<=a/2) {
	area=Math.PI*r*r;
}
else { //https://en.wikipedia.org/wiki/Circular_segment
	d=a/2;
	angle=2*Math.acos(d/r);
	extraArea=.5*(r*r)*(angle-Math.sin(angle));
	area=Math.PI*r*r-4*extraArea;
}

System.out.printf("%.3f",area);
	}

}
