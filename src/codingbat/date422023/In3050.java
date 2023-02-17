package codingbat.date422023;

import java.util.ArrayList;
import java.util.Scanner;

public class In3050 {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean in3050(int a, int b) {
		  if((30 <= a && a <= 40) && (30 <= b && b <= 40)){
		    return true;
		  }
		  if((40 <= a && a <= 50) && (40 <= b && b <= 50)){
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
			System.out.println("Input of in3050: " + aNumbers.get(i) + " " + bNumbers.get(i));
			System.out.println("Output of in3050: " + in3050(aNumbers.get(i), bNumbers.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
