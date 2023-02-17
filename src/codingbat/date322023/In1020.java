package codingbat.date322023;

import java.util.ArrayList;
import java.util.Scanner;

public class In1020 {
private static Scanner sc = new Scanner(System.in);
	
	public static boolean in1020(int a, int b) {
		  return (10 <= a && a <=20 || 10 <= b && b <=20);
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
			System.out.println("Input of in1020: " + aNumbers.get(i) + " " + bNumbers.get(i));
			System.out.println("Output of in1020: " + in1020(aNumbers.get(i), bNumbers.get(i)));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
