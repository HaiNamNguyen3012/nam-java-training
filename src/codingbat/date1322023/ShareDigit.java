package codingbat.date1322023;

import java.util.ArrayList;
import java.util.Scanner;

public class ShareDigit {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean shareDigit(int a, int b) {
		  int result1 = a%10;
		  int result2 = (a-result1)/10;
		  int result3 = b%10;
		  int result4 = (b-result1)/10;
		  return (result1 == result3 || result1 == result4 || result2 == result3 || result2 == result4);
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
			System.out.println("Input of shareDigit: " + aNums.get(i) + " " + bNums.get(i));
			System.out.println("Output of shareDigit: " + shareDigit(aNums.get(i), bNums.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
