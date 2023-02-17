package codingbat.date1122023;

import java.util.ArrayList;
import java.util.Scanner;

public class SquirrelPlay {
	
	private static Scanner sc = new Scanner(System.in); 
	
	public static boolean squirrelPlay(int temp, boolean isSummer) {
		  if(!isSummer && 60 <= temp && temp <= 90 || isSummer && 60 <= temp && temp <= 100) return true;
		  return false;
	}
	
	public static void solve() {
		ArrayList<Integer> temps = new ArrayList<Integer>();
		ArrayList<Boolean> isSummers = new ArrayList<Boolean>();
		
		System.out.println("Please enter number of testcases you want: ");
		int numberOfTestCases = sc.nextInt();
		
		for(int i = 0; i < numberOfTestCases; i++) {
			int temp = sc.nextInt();
			temps.add(temp);
			boolean isSummer = sc.nextBoolean();
			isSummers.add(isSummer);
		}
		
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of squirrelPlay: " + temps.get(i) + " " + isSummers.get(i));
			System.out.println("Output of squirrelPlay: " + squirrelPlay(temps.get(i), isSummers.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
