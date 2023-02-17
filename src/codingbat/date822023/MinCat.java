package codingbat.date822023;

import java.util.ArrayList;
import java.util.Scanner;

public class MinCat {
	private static Scanner sc = new Scanner(System.in);
	public static String minCat(String a, String b) {
		  int len = Math.min(a.length(), b.length());
		  if(a.length() > b.length()){
		    return a.substring(a.length()-len) + b;
		  }
		  return a + b.substring(b.length()-len);
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
			System.out.println("Input of minCat: " + aStrings.get(i) + " " + bStrings.get(i));
			System.out.println("Output of minCat: " + minCat(aStrings.get(i), bStrings.get(i)));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
