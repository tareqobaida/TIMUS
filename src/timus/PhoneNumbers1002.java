package timus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class PhoneNumbers1002 {
static HashMap<Integer, String> finalWords=new HashMap<>();
static char[][] map= {{'o','q','z'},{'i','j'},{'a','b','c'},{'d','e','f'},{'g','h'},{'k','l'},{'m','n'},{'p','r','s'},{'t','u','v'},{'w','x','y'}};

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String word;
		String[] arrNumber = null;
		String tempNum;
		int start=0,end = 0;
		Character sChar;
		int noofwords;
		HashMap<Character, LinkedList<String>> words=new HashMap<>();
		HashMap<Integer, Integer> memory=new HashMap<>();		
		LinkedList<String> tempList;
		while(sc.hasNext()){
			tempNum=sc.nextLine();
			if(tempNum.equals("-1")) break;
			arrNumber=tempNum.split("");
			end=arrNumber.length-1;
			noofwords=Integer.parseInt(sc.nextLine());
			for(int i=0;i<noofwords;i++) {
				word=sc.nextLine();
				sChar=word.charAt(0);
				//System.out.println(word);
				if(words.containsKey(sChar)) {
					words.get(sChar).add(word);
				}
				else {
					tempList=new LinkedList<>();
					tempList.add(word);
					words.put(sChar, tempList);
				}
			}
			int result=findWords(start,end,arrNumber,words,memory);
			memory.clear();
			if(result<=end+1) {
				int i=0;
				while(i<=end) {
					System.out.print(finalWords.get(i)+" ");
					i+=finalWords.get(i).length();
				}
			}
			else {
				System.out.println("No solution.");
			}
			System.out.println();
			
			
		} 
		

	}

	private static int findWords(int start, int end,String[] arrNumber,
			HashMap<Character, LinkedList<String>> words, HashMap<Integer, Integer> memory) {
		if(memory.containsKey(start) && memory.get(start)>=0) return memory.get(start);
		if(start>end) return 0;
		LinkedList <String> possibleWords=new LinkedList<>();
		LinkedList <String> candidateWords=new LinkedList<>();
		ArrayList<Integer> lengths=new ArrayList<>();
		int min=100000,temp;
		String myWord = null;
		int curDigit=Integer.parseInt(arrNumber[start]);
		for(char c:map[curDigit]) {
			if(words.get(c)!=null)
			possibleWords.addAll(words.get(c));
		}
		int i=0;
		int tempStart=start;
		while(possibleWords.size()>0 && tempStart<arrNumber.length) {
			
			curDigit=Integer.parseInt(arrNumber[tempStart]);
			Iterator<String> ite=possibleWords.iterator();
			while(ite.hasNext()) {
				String word=ite.next();
				if(Arrays.binarySearch(map[curDigit], word.charAt(i))<0) {
					ite.remove();
				}
				else if(word.length()==i+1){
					lengths.add(i+1);
					ite.remove();
					candidateWords.add(word);
				}
			}
			tempStart++;
			i++;
		}

		for(String w:candidateWords) {
			temp=1+findWords(start+w.length(), end, arrNumber, words, memory);
			if(min>=temp) {
				min=temp;
				myWord=w;
			}
		}
		if(myWord!=null)finalWords.put(start,myWord);
		memory.put(start, min);
		return min;
	}

}
