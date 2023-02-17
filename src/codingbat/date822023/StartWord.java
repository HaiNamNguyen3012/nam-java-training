package codingbat.date822023;

import java.util.ArrayList;
import java.util.Scanner;

public class StartWord {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static String startWord(String str, String word) {
		  if(str.length() >= word.length() && str.substring(1, word.length()).equals(word.substring(1)))
		    return str.substring(0, word.length());
		  return "";
	}
	
	public static void solve() {
		ArrayList<String> aStrings = new ArrayList<String>();
		ArrayList<String> bStrings = new ArrayList<String>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			String aString = sc.next();
			aStrings.add(aString);
			String bString = sc.next();
			bStrings.add(bString);
		}
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of startWord: " + aStrings.get(i) + " " + bStrings.get(i));
			System.out.println("Output of startWord: " + startWord(aStrings.get(i), bStrings.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
