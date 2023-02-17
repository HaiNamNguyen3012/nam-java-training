package codingbat.date1622023;

import java.util.ArrayList;
import java.util.Scanner;

public class OneTwo {
	
	private static Scanner sc = new Scanner(System.in); 
	
	public static String oneTwo(String str) {
		  int frontLen = str.length() - (str.length()%3);
		  String result = "";
		  for(int i = 0; i < frontLen; i += 3){
		    String subString = str.substring(i, i+3);
		    result = result + moveFirstChar(subString);
		  }
		  return result;
	}

	public static String moveFirstChar(String str){
	  String result = "";
	  for(int i = 1; i < 3; i++){
		  result = result + str.charAt(i);
	  }
	  return result + str.charAt(0);
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
			System.out.println("Input of oneTwo: " + strings.get(i));
			System.out.println("Output of oneTwo: " + oneTwo(strings.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
