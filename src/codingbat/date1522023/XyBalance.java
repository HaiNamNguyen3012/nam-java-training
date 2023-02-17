package codingbat.date1522023;

import java.util.ArrayList;
import java.util.Scanner;

public class XyBalance {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean xyBalance(String str) {
		  boolean isY = false;
		  for(int i = str.length() - 1; i >= 0; i--){
		    if(str.charAt(i) == 'y') isY = true;
		    else if((str.charAt(i) == 'x' && isY == false)) return false;
		  }
		  return true;
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
			System.out.println("Input of xyBalance: " + strings.get(i));
			System.out.println("Output of xyBalance: " + xyBalance(strings.get(i)));
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
