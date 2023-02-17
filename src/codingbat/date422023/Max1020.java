package codingbat.date422023;

import java.util.ArrayList;
import java.util.Scanner;

public class Max1020 {
	private static Scanner sc = new Scanner(System.in);
	
	public static int max1020(int a, int b) {
		  if(b > a){
		    int temp = a;
		    a = b;
		    b = temp;
		  }
		  if(a >= 10 && a <=20) return a;
		  if(b >= 10 && b <=20) return b;
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
			System.out.println("Input of max1020: " + aNumbers.get(i) + " " + bNumbers.get(i));
			System.out.println("Output of max1020: " + max1020(aNumbers.get(i), bNumbers.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
