package codingbat.date422023;

import java.util.ArrayList;
import java.util.Scanner;

public class Close10 {
	private static Scanner sc = new Scanner(System.in);
	
	public static int close10(int a, int b) {
		  if(Math.abs(10-a) < Math.abs(10-b)){
		    return a;
		  } else if(Math.abs(10-a) > Math.abs(10-b)){
		    return b;
		  }
		  return 0;
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
			System.out.println("Input of close10: " + aNumbers.get(i) + " " + bNumbers.get(i));
			System.out.println("Output of close10: " + close10(aNumbers.get(i), bNumbers.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
