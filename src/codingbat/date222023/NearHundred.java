package codingbat.date222023;

import java.util.ArrayList;
import java.util.Scanner;

public class NearHundred {
	private static Scanner sc = new Scanner(System.in);
	public static boolean nearHundred(int n) {
		if(Math.abs(100-n) <= 10 || Math.abs(200-n) <= 10){
			return true;
		}
		return false;
	}
	public static void solve() {
		ArrayList<Integer> Numbers = new ArrayList<Integer>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			int number = sc.nextInt();
			Numbers.add(number);
		}
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of Near Hundred: " + Numbers.get(i));
			System.out.println("Output of Near Hundred: " + nearHundred(Numbers.get(i)));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
