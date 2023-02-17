package codingbat.date322023;

import java.util.ArrayList;
import java.util.Scanner;

public class StartOz {
	private static Scanner sc = new Scanner(System.in);
	
	public static String startOz(String str) {
		  String newString = "";
		  if(str.length() >= 1 && str.charAt(0) == 'o'){
		    newString+=str.charAt(0);
		  }
		  if(str.length() >= 2 && str.charAt(1) == 'z'){
		    newString+=str.charAt(1);
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
			System.out.println("Input  startOz: " + strings.get(i));
			System.out.println("Output  startOz: " +  startOz(strings.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
