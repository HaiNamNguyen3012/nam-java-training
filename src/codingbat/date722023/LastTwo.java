package codingbat.date722023;

import java.util.ArrayList;
import java.util.Scanner;

public class LastTwo {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static String lastTwo(String str) {
		  if(str.length() < 2)
		    return str;
		  else if(str.length() == 2){
		    return str.substring(1) + str.substring(0,1);
		  }
		  return str.substring(0, str.length()-2) + str.charAt(str.length()-1) + str.charAt(str.length()-2);
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
			System.out.println("Input of lastTwo: " + strings.get(i));
			System.out.println("Output of lastTwo: " + lastTwo(strings.get(i)));
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}
}
