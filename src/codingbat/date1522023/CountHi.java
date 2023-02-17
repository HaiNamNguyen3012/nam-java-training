package codingbat.date1522023;

import java.util.ArrayList;
import java.util.Scanner;

public class CountHi {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int countHi(String str) {
		  int hi = 0;
		  for(int i = 0; i <= str.length()-2; i++){
		    if(str.substring(i, i+2).equals("hi")) hi++;
		  }
		  return hi;
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
			System.out.println("Input of countHi: " + strings.get(i));
			System.out.println("Output of countHi: " + countHi(strings.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
