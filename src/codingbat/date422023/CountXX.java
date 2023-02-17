package codingbat.date422023;

import java.util.ArrayList;
import java.util.Scanner;

public class CountXX {
	private static Scanner sc = new Scanner(System.in);
	public static int countXX(String str) {
		  int count = 0;
		  for(int i = 0; i < str.length()-1; i++){
		    if(str.substring(i, i+2).equals("xx")){
		      count++;
		    }
		  }
		  return count;
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
			System.out.println("Input of countXX: " + strings.get(i));
			System.out.println("Output of countXX: " + countXX(strings.get(i)));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}
}
