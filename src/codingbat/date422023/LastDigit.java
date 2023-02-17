package codingbat.date422023;

import java.util.ArrayList;
import java.util.Scanner;

public class LastDigit {
	private static Scanner sc = new Scanner(System.in);
	public static boolean lastDigit(int a, int b) {
		  return (a%10 == b%10);
	}
	public static void solve() {
		ArrayList<Integer> aNumbers = new ArrayList<Integer>();
		ArrayList<Integer> bNumbers = new ArrayList<Integer>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			int aNumber = sc.nextInt();
			aNumbers.add(aNumber);
			int bNumber = sc.nextInt();
			bNumbers.add(bNumber);
		}
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of lastDigit: " + aNumbers.get(i) + " " + bNumbers.get(i));
			System.out.println("Output of lastDigit: " + lastDigit(aNumbers.get(i), bNumbers.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
