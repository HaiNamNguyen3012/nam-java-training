package codingbat.date222023;

import java.util.ArrayList;
import java.util.Scanner;

public class MissingChar {
	private static Scanner sc = new Scanner(System.in);
	public static String missingChar(String str, int n) {
	  String str1 = "";
	  for(int i = 0; i < str.length(); i++){
	    if(i==n){
		  continue;
		}
		str1 += str.charAt(i);
	  }
	  return str1;
	}
	
	public static void solve() {
		ArrayList<String> strings = new ArrayList<String>();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		for(int i = 0; i < numberOfTestCases; i++) {
			String string = sc.next();
			int number = sc.nextInt();
			strings.add(string);
			numbers.add(number);
		}
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of missingChar: " + strings.get(i) + " " + numbers.get(i));
			System.out.println("Output of missingChar: " + missingChar(strings.get(i), numbers.get(i)));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
