package codingbat.date1522023;

import java.util.ArrayList;
import java.util.Scanner;

public class CountCode {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int countCode(String str) {
		  int count = 0;
		  for(int i = 0; i < str.length()-3; i++){
		    if(str.charAt(i) == 'c' && str.charAt(i+1) == 'o' && str.charAt(i+3) == 'e')
		      count++;
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
			System.out.println("Input of countCode: " + strings.get(i));
			System.out.println("Output of countCode: " + countCode(strings.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
