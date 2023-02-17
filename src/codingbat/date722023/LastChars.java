package codingbat.date722023;

import java.util.ArrayList;
import java.util.Scanner;

public class LastChars {
	private static Scanner sc = new Scanner(System.in);
	public static String lastChars(String a, String b) {
		  if(a == "" && b != ""){
		    return "@" + b.charAt(b.length()-1);
		  } else if(a != "" && b == ""){
		    return a.charAt(0) + "@";
		  } else if(a == "" && b == ""){
		    return "@@";
		  }
		  return a.substring(0,1) + b.substring(b.length() - 1);
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
			System.out.println("Input of lastChars: " + aStrings.get(i) + " " + bStrings.get(i));
			System.out.println("Output of lastChars: " + lastChars(aStrings.get(i), bStrings.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
