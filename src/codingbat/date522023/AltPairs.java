package codingbat.date522023;

import java.util.ArrayList;
import java.util.Scanner;

public class AltPairs {
	private static Scanner sc = new Scanner(System.in);
	
	public static String altPairs(String str) {
		  String newString = "";
		  for(int i = 0; i < str.length(); i+=4){
		    int end = i+2;
		    if(end > str.length()) end = str.length();
		    newString += str.substring(i, end);
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
			System.out.println("Input of altPairs: " + strings.get(i));
			System.out.println("Output of altPairs: " + altPairs(strings.get(i)));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
