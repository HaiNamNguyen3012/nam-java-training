package codingbat.date1522023;

import java.util.ArrayList;
import java.util.Scanner;

public class EndOther {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean endOther(String a, String b) {
		  String aLower = a.toLowerCase();
			String bLower = b.toLowerCase();
			
			String result = "";
			if(aLower.length() == b.length()){
			  if(aLower.equals(bLower)) return true;
			}else if(aLower.length() < bLower.length()) {
				result = bLower.substring(bLower.length() - aLower.length());
				if(result.equals(aLower)) return true;
			} else if(aLower.length() > bLower.length()) {
				result = aLower.substring(aLower.length() - bLower.length());
				if(result.equals(bLower)) return true;
			}
			return false;
	}
	
	public static void solve() {
		ArrayList<String> strings = new ArrayList<String>();
		ArrayList<String> strings2 = new ArrayList<String>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			String string = sc.nextLine();
			strings.add(string);
			String string2 = sc.nextLine();
			strings2.add(string2);
		}
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of endOther: " + strings.get(i) + " " + strings2.get(i));
			System.out.println("Output of endOther: " + endOther(strings.get(i), strings2.get(i)));
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
