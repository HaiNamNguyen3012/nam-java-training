package codingbat.date722023;

import java.util.ArrayList;
import java.util.Scanner;

public class TheEnd {
	private static Scanner sc = new Scanner(System.in);
	
	public static String theEnd(String str, boolean front) {
		  int theLastPosition = str.length() - 1;
		  if(front) return str.substring(0,1);
		  return str.substring(theLastPosition);
	}
	
	public static void solve() {
		ArrayList<String> strings = new ArrayList<String>();
		ArrayList<Boolean> fronts = new ArrayList<Boolean>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			String string = sc.next();
			strings.add(string);
			boolean front = sc.nextBoolean();
			fronts.add(front);
		}
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of theEnd: " + strings.get(i) + " " + fronts.get(i));
			System.out.println("Output of theEnd: " + theEnd(strings.get(i), fronts.get(i)));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
