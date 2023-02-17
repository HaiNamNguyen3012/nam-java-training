package codingbat.date222023;

import java.util.ArrayList;
import java.util.Scanner;

public class SumDouble {
	private static Scanner sc = new Scanner(System.in);
	public static int sumDouble(int a, int b) {
		if(a==b){
		    return 2*(a+b);
		}
		return a+b;
	}
	public static void solve() {
		ArrayList<Integer> aNumbers = new ArrayList<Integer>();
		ArrayList<Integer> bNumbers = new ArrayList<Integer>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			int aNumber = sc.nextInt();
			int bNumber = sc.nextInt();
			aNumbers.add(aNumber);
			bNumbers.add(bNumber);
		}
		
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of SumDouble: " + aNumbers.get(i) + " " +  bNumbers.get(i));
			System.out.println("Output of SumDouble: " + sumDouble(aNumbers.get(i), bNumbers.get(i)));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
