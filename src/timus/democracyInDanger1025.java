package timus;

import java.util.Arrays;
import java.util.Scanner;

public class democracyInDanger1025 {

	public static void main(String[] args) {
		int maxgroup,sum=0;
		double totalpopulation=0;
Scanner sc=new Scanner(System.in);
int k=sc.nextInt();
if(k>101 || k<1) return;
int[] groups= new int[k];
int i=0;
while(sc.hasNextInt()) {
	groups[i]=sc.nextInt();
	i++;
}

for(int y:groups) {
	totalpopulation+=y;
}

if(totalpopulation>9999) return;

Arrays.sort(groups);
maxgroup=(k+1)/2;
int[] requiredgroups=Arrays.copyOfRange(groups, 0, maxgroup);
for(Integer x:requiredgroups) {
	sum+=(x+1)/2;
}

System.out.println(sum);
	}

}
