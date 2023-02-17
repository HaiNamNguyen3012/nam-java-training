package codingbat.date1622023;

import java.util.ArrayList;
import java.util.Scanner;

public class SameStarChar {
	
	private static Scanner sc = new Scanner(System.in); 

	public static boolean sameStarChar(String str) {
		  for(int i = 1; i < str.length() -1; i++){
		    if(str.charAt(i) == '*' && str.charAt(i-1) != str.charAt(i+1)){
		      return false;
		    }
		  }
		  return true;
	}
	
	public static void solve() {
		ArrayList<String> strings = new ArrayList<String>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			String string = sc.next();
			strings.add(string);
		}
		
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of sameStarChar: " + strings.get(i));
			System.out.println("Output of sameStarChar: " + sameStarChar(strings.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
