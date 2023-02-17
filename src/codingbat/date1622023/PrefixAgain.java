package codingbat.date1622023;

import java.util.ArrayList;
import java.util.Scanner;

public class PrefixAgain {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean prefixAgain(String str, int n) {
		  String childStr = str.substring(0,n);
		  for(int i = n; i <= str.length()-n; i++){
		    if(str.substring(i, i+n).equals(childStr))
		      return true;
		  }
		  return false;
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
			System.out.println("Input of prefixAgain: " + strings.get(i) + " " + numbers.get(i));
			System.out.println("Output of prefixAgain: " + prefixAgain(strings.get(i), numbers.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
