package codingbat.date1222023;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoAsOne {
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean twoAsOne(int a, int b, int c) {
		  return (a + b == c || c + b == a|| a + c == b);
	}
	
	public static void solve() {
		ArrayList<Integer> variables1 = new ArrayList<Integer>();
		ArrayList<Integer> variables2 = new ArrayList<Integer>();
		ArrayList<Integer> variables3 = new ArrayList<Integer>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			int variable1 = sc.nextInt();
			variables1.add(variable1);
			int variable2 = sc.nextInt();
			variables2.add(variable2);
			int variable3 = sc.nextInt();
			variables3.add(variable3);
		}
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of twoAsOne: " + variables1.get(i) + " " + variables2.get(i) + " " + variables3.get(i));
			System.out.println("Output of twoAsOne: " + twoAsOne(variables1.get(i), variables2.get(i), variables3.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
