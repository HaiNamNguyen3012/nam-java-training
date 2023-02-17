package codingbat.date1522023;

import java.util.ArrayList;
import java.util.Scanner;

public class XyzThere {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean xyzThere(String str) {
		  if(str.length() >=3 && str.substring(0, 3).equals("xyz")) return true;
		  
		  for(int i = 1; i < str.length() - 2; i++) {
		    if(str.charAt(i - 1) != '.' && str.substring(i, i + 3).equals("xyz"))
		      return true;
		  }
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
			System.out.println("Input of xyzThere: " + strings.get(i));
			System.out.println("Output of xyzThere: " + xyzThere(strings.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
