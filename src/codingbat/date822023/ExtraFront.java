package codingbat.date822023;

import java.util.ArrayList;
import java.util.Scanner;

public class ExtraFront {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static String extraFront(String str) {
		  if(str.length() < 2) return str+str+str;
		  String front = str.substring(0,2);
		  return front+front+front;
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
			System.out.println("Input of extraFront: " + strings.get(i));
			System.out.println("Output of extraFront: " + extraFront(strings.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
