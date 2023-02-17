package codingbat.date1322023;

import java.util.ArrayList;
import java.util.Scanner;

public class SumLimit {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int sumLimit(int a, int b) {
		  int result = a+b;
		  String aString = String.valueOf(a);
		  String resultString = String.valueOf(result);
		  if(resultString.length() > aString.length()) return a;
		  return result;
	}
	
	public static void solve() {
		ArrayList<Integer> aNums = new ArrayList<Integer>();
		ArrayList<Integer> bNums = new ArrayList<Integer>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			int aNum = sc.nextInt();
			aNums.add(aNum);
			int bNum = sc.nextInt();
			bNums.add(bNum);
		}
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of sumLimit: " + aNums.get(i) + " " + bNums.get(i));
			System.out.println("Output of sumLimit: " + sumLimit(aNums.get(i), bNums.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
