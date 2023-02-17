package codingbat.date822023;

import java.util.ArrayList;
import java.util.Scanner;

public class Without2 {
	private static Scanner sc = new Scanner(System.in);
	
	public static String without2(String str) {
		  if(str.length() >= 2 && str.substring(0,2).equals(str.substring(str.length()-2))){
		    return str.substring(2);
		  }
		  return str;
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
			System.out.println("Input of without2: " + strings.get(i));
			System.out.println("Output of without2: " + without2(strings.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
