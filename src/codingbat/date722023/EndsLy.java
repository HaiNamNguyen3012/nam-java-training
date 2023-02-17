package codingbat.date722023;

import java.util.ArrayList;
import java.util.Scanner;

public class EndsLy {
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean endsLy(String str) {
		  if(str.length() < 2) return false;
		  String endString = str.substring(str.length() - 2);
		  if(endString.equals("ly")) return true;
		  return false;
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
			System.out.println("Input of endsLy: " + strings.get(i));
			System.out.println("Output of endsLy: " + endsLy(strings.get(i)));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
