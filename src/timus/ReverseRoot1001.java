package timus;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseRoot1001 {

	public static void main(String[] args) {
		List<BigInteger> list=new ArrayList<BigInteger>();
Scanner sc=new Scanner(System.in);
String str=" ";
while(sc.hasNextBigInteger()) {
	str=str+"  "+sc.nextLine().toString();	
}
Scanner scr=new Scanner(str);
PrintWriter out=new PrintWriter(System.out);

while(scr.hasNextBigInteger()) {
	list.add(scr.nextBigInteger());
}
Collections.reverse(list);
for(BigInteger sq:list) {
	out.println(Math.sqrt(sq.doubleValue()));
	
}
out.flush();

	}

}
