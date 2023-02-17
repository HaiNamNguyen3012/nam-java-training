package codingbat.date1522023;

import java.util.ArrayList;
import java.util.Scanner;

public class MixString {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static String mixString(String a, String b) {
		  int minLength = Math.min(a.length(), b.length());
		  String result = "";
		  for(int i = 0; i < minLength; i++){
		    result = result + a.charAt(i) + b.charAt(i);
		  } 
		  return result + a.substring(minLength) + b.substring(minLength);
	}
	
	public static void solve() {
		ArrayList<String> strings = new ArrayList<String>();
		ArrayList<String> strings2 = new ArrayList<String>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			String string = sc.nextLine();
			strings.add(string);
			String string2 = sc.nextLine();
			strings2.add(string2);
		}
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of mixString: " + strings.get(i) + " " + strings2.get(i));
			System.out.println("Output of mixString: " + mixString(strings.get(i), strings2.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
