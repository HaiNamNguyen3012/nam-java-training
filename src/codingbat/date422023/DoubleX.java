package codingbat.date422023;

import java.util.ArrayList;
import java.util.Scanner;

public class DoubleX {
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean doubleX(String str) {
		  int positionX = str.indexOf("x");
		  
		  if(positionX + 1 >= str.length()) return false;
		  
		  return(str.charAt(positionX+1) == 'x');
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
			System.out.println("Input of doubleX: " + strings.get(i));
			System.out.println("Output of doubleX: " + doubleX(strings.get(i)));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
