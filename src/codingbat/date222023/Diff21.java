package codingbat.date222023;

import java.util.ArrayList;
import java.util.Scanner;

public class Diff21 {
	private static Scanner sc = new Scanner(System.in);
	public static int diff21(int n) {
		if( n < 21 ){
		    return 21 - n;
		} else{
		    return 2*(n-21);
		}
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
			System.out.println("Input of Diff21: " + Numbers.get(i));
			System.out.println("Output of Diff21: " +  diff21(Numbers.get(i)));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}
}
