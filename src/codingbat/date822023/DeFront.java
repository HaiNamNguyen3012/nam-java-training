package codingbat.date822023;

import java.util.ArrayList;
import java.util.Scanner;

public class DeFront {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static String deFront(String str) {    
		  if(str.substring(0,2).equals("ab")) return str;
		  else if(str.charAt(0) == 'a' && str.charAt(1) != 'b') return 'a' + str.substring(2);
		  else if(str.charAt(0) != 'a' && str.charAt(1) == 'b') return 'b' + str.substring(2);
		  return str.substring(2);
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
			System.out.println("Input of deFront: " + strings.get(i));
			System.out.println("Output of deFront: " + deFront(strings.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
