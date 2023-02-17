package codingbat.date722023;

import java.util.ArrayList;
import java.util.Scanner;

public class MiddleTwo {
	private static Scanner sc = new Scanner(System.in);
	
	public static String middleTwo(String str) {
		  int theMiddleLength = str.length()/2;
		  return str.substring(theMiddleLength-1, theMiddleLength+1);
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
			System.out.println("Output of middleTwo: " + middleTwo(strings.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
