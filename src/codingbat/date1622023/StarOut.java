package codingbat.date1622023;

import java.util.ArrayList;
import java.util.Scanner;

public class StarOut {
	
	private static Scanner sc = new Scanner(System.in); 
	
	public static String starOut(String str) {
		  if(str.length() == 0 || str.length() == 1 && str.charAt(0) == '*') return "";
		  if(str.length() == 1 && str.charAt(0) != '*') return str;
		  String result = "";
		  if(str.charAt(0) != '*' && str.charAt(1) != '*') result = result + str.charAt(0);
		  for( int i = 1; i < str.length() - 1; i++){
		    if(str.charAt(i-1) == '*' || str.charAt(i) == '*' || str.charAt(i+1) == '*') continue;
		    else result = result + str.charAt(i);
		  }
		   if(str.charAt(str.length() - 1) != '*' && str.charAt(str.length() - 2) != '*') result = result + str.charAt(str.length() - 1);
		   return result;
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
			System.out.println("Input of starOut: " + strings.get(i));
			System.out.println("Output of starOut: " + starOut(strings.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
