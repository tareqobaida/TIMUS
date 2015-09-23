package timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class SuperLongSum1048 {

	public static void main(String[] args) throws IOException {
StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
in.nextToken();
int n=(int) in.nval;
byte[] a= new byte[n];
byte[] b=new byte[n];
byte carry=0,sum=0;
StringBuffer s = new StringBuffer();
for(int i=0;i<n;i++) {
	in.nextToken();
	a[i]=(byte) in.nval;
	in.nextToken();
	b[i]=(byte) in.nval;

}
for(int i=n-1;i>=0;i--) {
	sum=(byte) (a[i]+b[i]+carry);
	if(sum>=10) {
		sum-=10;
		carry=1;
	}
	else{
		carry=0;
	}
	s.append(sum);
}
System.out.println(s.reverse());
	}

}
