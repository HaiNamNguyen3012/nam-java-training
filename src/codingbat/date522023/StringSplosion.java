package codingbat.date522023;

import java.util.ArrayList;
import java.util.Scanner;

public class StringSplosion {
	private static Scanner sc = new Scanner(System.in);
	public static String stringSplosion(String str) {
		  String newStr = "";
		  for(int i = 0; i < str.length(); i++){
		    String childStr = str.substring(0, i+1);
		    newStr += childStr;
		  }
		  return newStr;
	}
	
	public static void solve() {
		ArrayList<String> strings = new ArrayList<String>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			String string = sc.nextLine();
			strings.add(string);
		}
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of stringSplosion: " + strings.get(i));
			System.out.println("Output of stringSplosion: " + stringSplosion(strings.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
