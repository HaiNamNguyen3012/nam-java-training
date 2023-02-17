package codingbat.date822023;

import java.util.ArrayList;
import java.util.Scanner;

public class SeeColor {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static String seeColor(String str) {
		  if(str.length() >= 3 && str.substring(0,3).equals("red")){
		    return "red";
		  } else if(str.length() >= 4 && str.substring(0,4).equals("blue")){
		    return "blue"; 
		  }
		  return "";
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
			System.out.println("Input of seeColor: " + strings.get(i));
			System.out.println("Output of seeColor: " + seeColor(strings.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
