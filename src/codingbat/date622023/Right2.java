package codingbat.date622023;

import java.util.ArrayList;
import java.util.Scanner;

public class Right2 {
	private static Scanner sc = new Scanner(System.in);
	
	public static String right2(String str) {
		  return str.substring(str.length()-2) + str.substring(0,str.length()-2);
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
			System.out.println("Input of right2: " + strings.get(i));
			System.out.println("Output of right2: " + right2(strings.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
