package codingbat.date322023;

import java.util.ArrayList;
import java.util.Scanner;

public class IntMax {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int intMax(int a, int b, int c) {
		  if(a <= b && b >= c){
		    return b;
		  } else if(b <= a && a >= c){
		    return a;
		  }
		  return c;
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
			System.out.println("Input of intMax: " + aNumbers.get(i) + " " + bNumbers.get(i) + " " +cNumbers.get(i));
			System.out.println("Output of intMax: " + intMax(aNumbers.get(i), bNumbers.get(i), cNumbers.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
