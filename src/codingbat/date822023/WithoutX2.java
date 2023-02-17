package codingbat.date822023;

import java.util.ArrayList;
import java.util.Scanner;

public class WithoutX2 {
	private static Scanner sc = new Scanner(System.in);
	
	public static String withoutX2(String str) {
		  String newString = "";
		  for(int i = 0; i < str.length(); i++){
		    if(i == 0 && str.charAt(i) == 'x' || i == 1 && str.charAt(i) == 'x'){
		      continue;
		    }
		    newString += str.charAt(i);
		  }
		  return newString;
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
			System.out.println("Input of withoutX2: " + strings.get(i));
			System.out.println("Output of withoutX2: " + withoutX2(strings.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
