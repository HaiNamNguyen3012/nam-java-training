package codingbat.date722023;

import java.util.ArrayList;
import java.util.Scanner;

public class ConCat {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static String conCat(String a, String b) {
		  if(a == "" || b == "" || a == "" && b == ""){
		    return a+b;
		  }
		  if(a.charAt(a.length() - 1) == b.charAt(0)){
		    return a + b.substring(1);
		  }
		  
		  return a + b;
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
			System.out.println("Input of conCat: " + aStrings.get(i) + " " + bStrings.get(i));
			System.out.println("Output of conCat: " + conCat(aStrings.get(i), bStrings.get(i)));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
