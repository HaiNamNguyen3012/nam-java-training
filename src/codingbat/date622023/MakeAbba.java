package codingbat.date622023;

import java.util.ArrayList;
import java.util.Scanner;

public class MakeAbba {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static String makeAbba(String a, String b) {
		  return a+b+b+a;
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
			System.out.println("Input of makeAbba: " + aStrings.get(i) + " " + bStrings.get(i));
			System.out.println("Output of makeAbba: " + makeAbba(aStrings.get(i), bStrings.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
