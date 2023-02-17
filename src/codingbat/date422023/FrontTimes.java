package codingbat.date422023;

import java.util.ArrayList;
import java.util.Scanner;

public class FrontTimes {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static String frontTimes(String str, int n) {
		  int frontLenStr = 3;
		  String newStr = "";
		  if(frontLenStr > str.length()){
		    frontLenStr = str.length();
		  }
		  String frontStr = str.substring(0, frontLenStr);
		  for(int i = 0; i < n; i++){
		    newStr += frontStr;
		  }
		  return newStr;
	}
	
	public static void solve() {
		ArrayList<String> strings = new ArrayList<String>();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			String string = sc.next();
			strings.add(string);
			int number = sc.nextInt();
			numbers.add(number);
		}
		
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of frontTimes: " + strings.get(i) + " " + numbers.get(i));
			System.out.println("Output of frontTimes: " + frontTimes(strings.get(i), numbers.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
