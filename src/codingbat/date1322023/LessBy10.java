package codingbat.date1322023;

import java.util.ArrayList;
import java.util.Scanner;

public class LessBy10 {

	private static Scanner sc = new Scanner(System.in);
	
	public static boolean lessBy10(int a, int b, int c) {
	  return (a<=b-10 || a<=c-10 || b<=a-10 || b<=c-10 || c<=a-10 || c<=b-10);
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
			System.out.println("Input of lessBy10: " + aNums.get(i) + " " + bNums.get(i) + " " + cNums.get(i));
			System.out.println("Output of lessBy10: " + lessBy10(aNums.get(i), bNums.get(i), cNums.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
