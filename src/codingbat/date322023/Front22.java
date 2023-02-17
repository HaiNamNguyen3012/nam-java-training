package codingbat.date322023;

import java.util.ArrayList;
import java.util.Scanner;

public class Front22 {
	private static Scanner sc = new Scanner(System.in);
	
	public static String front22(String str) {
		  if(str.length() <= 1){
		    return str + str + str;
		  }
		  String str1 = str.substring(0,2);
		  return str1 + str + str1;
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
			System.out.println("Input of front22: " + strings.get(i));
			System.out.println("Output of front22: " + front22(strings.get(i)));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
