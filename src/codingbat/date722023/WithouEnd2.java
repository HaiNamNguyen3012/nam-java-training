package codingbat.date722023;

import java.util.ArrayList;
import java.util.Scanner;

public class WithouEnd2 {
	private static Scanner sc = new Scanner(System.in);
	public static String withouEnd2(String str) {
		  if(str.length() <= 2) return "";
		  return str.substring(1, str.length()-1);
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
			System.out.println("Input of withouEnd2: " + strings.get(i));
			System.out.println("Output of withouEnd2: " + withouEnd2(strings.get(i)));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
