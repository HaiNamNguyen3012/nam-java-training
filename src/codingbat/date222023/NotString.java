package codingbat.date222023;

import java.util.ArrayList;
import java.util.Scanner;

public class NotString {
	private static Scanner sc = new Scanner(System.in);
	
	public static String notString(String str) {
		if(str.length() >= 3 && str.substring(0,3).equals("not")){
			return str;
		}
		return "not " + str;
	}
	
	public static void solve() {
		ArrayList<String> strs = new ArrayList<String>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			String str = sc.nextLine();
			strs.add(str);
		}
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of notString: " + strs.get(i));
			System.out.println("Output of notString: " + notString(strs.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
