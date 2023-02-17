package codingbat.date622023;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstTwo {
	private static Scanner sc = new Scanner(System.in);
	
	public static String firstTwo(String str) {
		  if(str.length() < 2) return str;
		  return str.substring(0,2);
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
			System.out.println("Input of firstTwo: " + strings.get(i));
			System.out.println("Output of firstTwo: " + firstTwo(strings.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
