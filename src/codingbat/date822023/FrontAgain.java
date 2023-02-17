package codingbat.date822023;

import java.util.ArrayList;
import java.util.Scanner;

public class FrontAgain {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean frontAgain(String str) {
		  if(str.length() < 2){
		     return false;
		  } else if(str.length() == 2){
		    return true;
		  }
		  return str.substring(0,2).equals(str.substring(str.length()-2));
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
			System.out.println("Input of frontAgain: " + strings.get(i));
			System.out.println("Output of frontAgain: " + frontAgain(strings.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
