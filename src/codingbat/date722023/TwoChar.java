package codingbat.date722023;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoChar {
	private static Scanner sc = new Scanner(System.in);

	public static String twoChar(String str, int index) {
		  if(str.length() < index || str.length() < index + 2 || index < 0){
		    return str.substring(0,2);
		  } 
		  return str.substring(index, index+2);
	}
	
	public static void solve() {
		ArrayList<String> strings = new ArrayList<String>();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			String string = sc.next();
			strings.add(string);
			int number = sc.nextInt();
			numbers.add(number);
		}
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of twoChar: " + strings.get(i) + " " + numbers.get(i));
			System.out.println("Output of twoChar: " + twoChar(strings.get(i), numbers.get(i)));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
