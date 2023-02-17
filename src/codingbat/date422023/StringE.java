package codingbat.date422023;

import java.util.ArrayList;
import java.util.Scanner;

public class StringE {
	private static Scanner sc = new Scanner(System.in);

	public static boolean stringE(String str) {
		  int count = 0;
		  for(int i = 0; i < str.length(); i++){
		    if(str.charAt(i) == 'e'){
		      count++;
		    }
		  }
		  if( 1 <= count && count <= 3){
		    return true;
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
			System.out.println("Input of stringE: " + strings.get(i));
			System.out.println("Output of stringE: " + stringE(strings.get(i)));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
