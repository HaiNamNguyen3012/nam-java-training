package codingbat.date422023;

import java.util.ArrayList;
import java.util.Scanner;

public class StringBits {
	private static Scanner sc = new Scanner(System.in);
	public static String stringBits(String str) {
		  String newString = "";
		  for(int i = 0; i < str.length(); i+=2){
		    newString += str.charAt(i);
		  }
		  return newString;
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
			System.out.println("Input of stringBits: " + strings.get(i));
			System.out.println("Output of stringBits: " + stringBits(strings.get(i)));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
