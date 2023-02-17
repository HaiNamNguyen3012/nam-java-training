package codingbat.date222023;

import java.util.ArrayList;
import java.util.Scanner;

public class Makes10 {
	private static Scanner sc = new Scanner(System.in);
	public static boolean makes10(int a, int b) {
		if( a==10||b==10 || a+b == 10){
			return true;
		}
		return false;
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
			System.out.println("Input of Makes10: " + aNumbers.get(i) + " " +  bNumbers.get(i));
			System.out.println("Output of Makes10: " + makes10(aNumbers.get(i), bNumbers.get(i)));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}
}
