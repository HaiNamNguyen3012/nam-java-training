package codingbat.date1622023;

import java.util.ArrayList;
import java.util.Scanner;

public class PlusOut {
	
	private static Scanner sc = new Scanner(System.in);
	
	
	public static String plusOut(String str, String word) {
		  int strLen = str.length();
		  int wordLen = word.length();
		  String result = "";
		  
		  for (int i = 0; i < strLen; i++) {
		    if (i <= strLen - wordLen) {
		      String tmp = str.substring(i,i+wordLen);
		      if (tmp.equals(word)) {
		        result += word;
		        i += wordLen-1;
		      }
		      else
		        result += "+";
		    }
		    else
		      result += "+";
		  }
		  
		  return result;
	}
	
	public static void solve() {
		ArrayList<String> strings = new ArrayList<String>();
		ArrayList<String> words = new ArrayList<String>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			String string = sc.next();
			strings.add(string);
			String word = sc.next();
			words.add(word);
		}
		
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of plusOut: " + strings.get(i) + " " + words.get(i));
			System.out.println("Output of plusOut: " + plusOut(strings.get(i),words.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}