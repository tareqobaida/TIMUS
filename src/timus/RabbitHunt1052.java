package timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RabbitHunt1052 {

	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		in.nextToken();
		int n=(int) in.nval;
		int[][] points=new int[n][2];
		HashMap<String, Set<Integer>> slopes=new HashMap<>();
		float dy,dx;
		String slope;
		DecimalFormat newFormat = new DecimalFormat("#.0000");
for(int i=0;i<n;i++) {
	in.nextToken();
	points[i][0]=(int) in.nval;
	in.nextToken();
	points[i][1]=(int) in.nval;
}

for(int i=0;i<n;i++) {
	for(int j=i+1;j<n;j++) {
		dy=points[j][1]-points[i][1];
		dx=points[j][0]-points[i][0];
		slope=newFormat.format(dy/dx);
		if(slopes.containsKey(slope)) {
			slopes.get(slope).add(j);
			slopes.get(slope).add(i);
		}
		else {
			Set<Integer> p=new HashSet<Integer>();
			p.add(j);
			p.add(i);
			slopes.put(slope, p);
		}
		
	}
}
class MyComparator implements Comparator<Set <Integer>>{

	@Override
	public int compare(Set<Integer> o1, Set<Integer> o2) {
		return o1.size()-o2.size();
	}
	
}
HashSet<Integer> myset=(HashSet<Integer>) Collections.max(slopes.values(), new MyComparator());
System.out.println(myset.size());
	}

}
