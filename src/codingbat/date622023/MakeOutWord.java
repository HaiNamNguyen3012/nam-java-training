package codingbat.date622023;

import java.util.ArrayList;
import java.util.Scanner;

public class MakeOutWord {
	private static Scanner sc = new Scanner(System.in);
	
	public static String makeOutWord(String out, String word) {
		  String frontOut = out.substring(0,2);
		  String backOut = out.substring(2);
		  
		  return frontOut + word + backOut;
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
			System.out.println("Input of makeOutWord: " + aStrings.get(i) + " " + bStrings.get(i));
			System.out.println("Output of makeOutWord: " + makeOutWord(aStrings.get(i), bStrings.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}
}
