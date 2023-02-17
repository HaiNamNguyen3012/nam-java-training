package codingbat.date422023;

import java.util.ArrayList;
import java.util.Scanner;

public class EndUp {
	private static Scanner sc = new Scanner(System.in);
	public static String endUp(String str) {
		  if(str.length()  <= 3){
		    return str.toUpperCase();
		  }
		  int newLength = str.length() - 3;
		  String front = str.substring(0, newLength);
		  String back = str.substring(newLength);
		  return front + back.toUpperCase();
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
			System.out.println("Input of endUp: " + strings.get(i));
			System.out.println("Output of endUp: " + endUp(strings.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
