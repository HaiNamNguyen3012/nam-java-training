package codingbat.date722023;

import java.util.ArrayList;
import java.util.Scanner;

public class HasBad {
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean hasBad(String str) {
		  if(str.length() < 3 || str.length() == 3 && str.charAt(0) != 'b') return false;
		  if(str.substring(0,3).equals("bad") || str.substring(1,4).equals("bad")){
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
			System.out.println("Input of hasBad: " + strings.get(i));
			System.out.println("Output of hasBad: " + hasBad(strings.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
