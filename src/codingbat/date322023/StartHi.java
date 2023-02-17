package codingbat.date322023;

import java.util.ArrayList;
import java.util.Scanner;

public class StartHi {
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean startHi(String str) {
		  if(str.length() <= 1) return false;
		  String newStr = str.substring(0,2);
		  if(newStr.equals("hi")){
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
			System.out.println("Input of startHi: " + strings.get(i));
			System.out.println("Output of startHi: " + startHi(strings.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
