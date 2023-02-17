package codingbat.date322023;

import java.util.ArrayList;
import java.util.Scanner;

public class HasTeen {
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean hasTeen(int a, int b, int c) {
		   return (13 <= a && a <= 19 || 13 <= b && b <=19 || 13 <= c && c <=19);
	}
	
	public static void solve() {
		ArrayList<Integer> aNumbers = new ArrayList<Integer>();
		ArrayList<Integer> bNumbers = new ArrayList<Integer>();
		ArrayList<Integer> cNumbers = new ArrayList<Integer>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			int aNumber = sc.nextInt();
			aNumbers.add(aNumber);
			int bNumber = sc.nextInt();
			bNumbers.add(bNumber);
			int cNumber = sc.nextInt();
			cNumbers.add(cNumber);
		}
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of hasTeen: " + aNumbers.get(i) + " " + bNumbers.get(i) + " " +cNumbers.get(i));
			System.out.println("Output of hasTeen: " + hasTeen(aNumbers.get(i), bNumbers.get(i), cNumbers.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}
}
