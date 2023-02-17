package codingbat.date222023;

import java.util.ArrayList;
import java.util.Scanner;

public class PosNeg {
	private static Scanner sc = new Scanner(System.in);
	public static boolean posNeg(int a, int b, boolean negative) {
		if(negative && (a < 0 && b < 0) || !negative && (a < 0 && b > 0) ||!negative && (a > 0 && b < 0)){
		  return true;
		}
		return false;
	}
	public static void solve() {
		ArrayList<Integer> aNumbers = new ArrayList<Integer>();
		ArrayList<Integer> bNumbers = new ArrayList<Integer>();
		ArrayList<Boolean> negativeStatuss = new ArrayList<Boolean>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			int aNumber = sc.nextInt();
			aNumbers.add(aNumber);
			int bNumber = sc.nextInt();
			bNumbers.add(bNumber);
			boolean negativeStatus = sc.nextBoolean();
			negativeStatuss.add(negativeStatus);
		}
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of Pos Neg: " + aNumbers.get(i) + " " +  bNumbers.get(i) + " " + negativeStatuss.get(i));
			System.out.println("Output of Pos Neg: " + posNeg(aNumbers.get(i), bNumbers.get(i), negativeStatuss.get(i)));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
