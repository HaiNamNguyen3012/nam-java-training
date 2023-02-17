package codingbat.date722023;

import java.util.ArrayList;
import java.util.Scanner;

public class MiddleThree {
	private static Scanner sc = new Scanner(System.in);
	
	public static String middleThree(String str) {
		  int theMiddleLength = (str.length()-3)/2;
		  return str.substring(theMiddleLength, str.length()-theMiddleLength);
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
			System.out.println("Input of middleTwo: " + strings.get(i));
			System.out.println("Output of middleTwo: " + middleThree(strings.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
