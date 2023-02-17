package codingbat.date322023;

import java.util.ArrayList;
import java.util.Scanner;

public class BackAround {
	private static Scanner sc = new Scanner(System.in);
	
	public static String backAround(String str) {
		char lastCharacter = str.charAt(str.length()-1);
		return lastCharacter + str + lastCharacter;
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
			System.out.println("Input of backAround: " + strings.get(i));
			System.out.println("Output of backAround: " + backAround(strings.get(i)));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}
}
