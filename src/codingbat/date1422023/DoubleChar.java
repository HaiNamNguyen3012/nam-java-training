package codingbat.date1422023;

import java.util.ArrayList;
import java.util.Scanner;

public class DoubleChar {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static String doubleChar(String str) {
		  String result = "";
		  for(int i = 0; i < str.length(); i++){
		    result = result + str.charAt(i) + str.charAt(i); 
		  }
		  return result;
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
			System.out.println("Input of doubleChar: " + strings.get(i));
			System.out.println("Output of doubleChar: " + doubleChar(strings.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
