package timus;

import java.math.BigDecimal;
import java.util.Scanner;

public class Conductors1011 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
double p=sc.nextDouble();
double q=sc.nextDouble();
double EPSILON=0.0000001;
int n=1;
int conductors;
double upbound,lowbound;
while(true){
	lowbound=p*n/100;
	upbound=q*n/100;
	conductors=(int)lowbound+1;
	if(upbound-conductors>EPSILON) {
		System.out.println(n);
		break;
	}
	n++;
}
	}

}
