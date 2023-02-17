package codingbat.date422023;

import java.util.ArrayList;
import java.util.Scanner;

public class EveryNth {
	private static Scanner sc = new Scanner(System.in);
	public static String everyNth(String str, int n) {
		  String newStr = "";
		  for(int i = 0; i < str.length(); i += n){
		    newStr += str.charAt(i);
		  }
		  return newStr;
	}
	public static void solve() {
		ArrayList<String> strings = new ArrayList<String>();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			String string = sc.next();
			strings.add(string);
			int number = sc.nextInt();
			numbers.add(number);
		}
		
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of everyNth: " + strings.get(i) + " " + numbers.get(i));
			System.out.println("Output of everyNth: " + everyNth(strings.get(i), numbers.get(i)));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}
}
