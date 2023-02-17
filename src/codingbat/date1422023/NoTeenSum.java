package codingbat.date1422023;

import java.util.ArrayList;
import java.util.Scanner;

public class NoTeenSum {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int noTeenSum(int a, int b, int c) {
		return isTeen(a) + isTeen(b) + isTeen(c);
	}

	public static int isTeen (int n){
		if(n >= 13 && n < 15 || n > 16 && n <= 19) n = 0;
		return n;
	}
	
	public static void solve() {
		ArrayList<Integer> aNums = new ArrayList<Integer>();
		ArrayList<Integer> bNums = new ArrayList<Integer>();
		ArrayList<Integer> cNums = new ArrayList<Integer>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			int aNum = sc.nextInt();
			aNums.add(aNum);
			int bNum = sc.nextInt();
			bNums.add(bNum);
			int cNum = sc.nextInt();
			cNums.add(cNum);
		}
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of noTeenSum: " + aNums.get(i) + " " + bNums.get(i)+ " " + cNums.get(i));
			System.out.println("Output of noTeenSum: " + noTeenSum(aNums.get(i), bNums.get(i), cNums.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}