package codingbat.date322023;

import java.util.ArrayList;
import java.util.Scanner;

public class LoneTeen {

	private static Scanner sc = new Scanner(System.in);
	
	public static boolean loneTeen(int a, int b) {
	    if((13 <= a && a <= 19) && (13 <= b && b <=19)){
	      return false;
	    } else if((13 <= a && a <= 19) || (13 <= b && b <=19)){
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
			System.out.println("Input of loneTeen: " + aNumbers.get(i) + " " + bNumbers.get(i));
			System.out.println("Output of loneTeen: " + loneTeen(aNumbers.get(i), bNumbers.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
