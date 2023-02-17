package codingbat.date322023;

import java.util.ArrayList;
import java.util.Scanner;

public class DelDel {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static String delDel(String str) {
		  if(str.length() < 4 || !str.substring(1,4).equals("del")){
		    return str;
		  }
		  String result = str.charAt(0) + str.substring(4);
		  return result;
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
			System.out.println("Input  delDel: " + strings.get(i));
			System.out.println("Output  delDel: " +  delDel(strings.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}
}
