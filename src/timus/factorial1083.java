package timus;

import java.util.Scanner;

public class factorial1083 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String s=sc.nextLine();
int k=s.split("").length-1;
/*while(sc.hasNext(Pattern.compile("!"))) {
	sc.next(Pattern.compile("!"));
	k++;
}*/

int result= (n%k!=0)? findfact(n,k): findfact2(n,k);
System.out.println(result);

	}

	private static int findfact2(int n, int k) {
		if(n<=k) return k;
		
		return n*findfact2(n-k,k);
	}

	private static int findfact(int n, int k) {
		if(n<k) return n%k;
		return n*findfact(n-k,k);
	}

}
