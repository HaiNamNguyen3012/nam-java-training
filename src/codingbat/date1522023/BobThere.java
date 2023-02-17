package codingbat.date1522023;

import java.util.ArrayList;
import java.util.Scanner;

public class BobThere {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean bobThere(String str) {
		  if(str.length() < 3) return false;
		  for(int i = 0; i < str.length() - 2; i++){
		    String subString = str.substring(i, i+3);
		    if(subString.charAt(0) == 'b' && subString.charAt(2) == 'b'){
		      return true;
		    }
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
			System.out.println("Input of bobThere: " + strings.get(i));
			System.out.println("Output of bobThere: " + bobThere(strings.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
