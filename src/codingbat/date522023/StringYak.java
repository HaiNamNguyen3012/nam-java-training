package codingbat.date522023;

import java.util.ArrayList;
import java.util.Scanner;

public class StringYak {
	private static Scanner sc = new Scanner(System.in);
	public static String stringYak(String str) {
		  String newStr = "";
		  for(int i = 0; i < str.length(); i++){
		    if(i+2 < str.length() && str.charAt(i) == 'y' && str.charAt(i+2) == 'k'){
		      i += 2;
		    } else{
		      newStr += str.charAt(i); 
		    }
		  }
		  return newStr;
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
			System.out.println("Input of stringYak: " + strings.get(i));
			System.out.println("Output of stringYak: " + stringYak(strings.get(i)));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
