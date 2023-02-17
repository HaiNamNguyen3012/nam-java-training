package codingbat.date522023;

import java.util.ArrayList;
import java.util.Scanner;

public class StringMatch {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int stringMatch(String a, String b) {
		  int len;
		  int count = 0;
		  if(a.length() < b.length()){
		    len = a.length();
		  } else{
		    len = b.length();
		  }
		  for(int i = 0; i < len-1; i++){
		    if(a.substring(i,i+2).equals(b.substring(i,i+2))){
		      count++;
		    }
		  }
		  return count;
	}
	
	public static void solve() {
		ArrayList<String> aStrings = new ArrayList<String>();
		ArrayList<String> bStrings = new ArrayList<String>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			String aString = sc.next();
			aStrings.add(aString);
			String bString = sc.next();
			bStrings.add(bString);
		}
		
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of stringMatch: " + aStrings.get(i) + " " + bStrings.get(i));
			System.out.println("Output of stringMatch: " + stringMatch(aStrings.get(i), bStrings.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
