package codingbat.date322023;

import java.util.ArrayList;
import java.util.Scanner;

public class MixStart {
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean mixStart(String str) {
		  if(str.length() < 3){
		    return false;
		  }
		  String str1 = str.substring(1,3);
		  return (str1.equals("ix"));
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
			System.out.println("Input  mixStart: " + strings.get(i));
			System.out.println("Output  mixStart: " +  mixStart(strings.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
