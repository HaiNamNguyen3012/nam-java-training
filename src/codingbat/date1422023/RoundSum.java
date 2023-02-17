package codingbat.date1422023;

import java.util.ArrayList;
import java.util.Scanner;

public class RoundSum {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int roundSum(int a, int b, int c) {
		return roundingNumber(a) + roundingNumber(b) + roundingNumber(c);
	}

	public static int roundingNumber(int num){
		int temp = num%10;
		if(temp >= 5) num += 10 - temp;
		else num = num - temp;
		return num;
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
			System.out.println("Input of roundSum: " + aNums.get(i) + " " + bNums.get(i)+ " " + cNums.get(i));
			System.out.println("Output of roundSum: " + roundSum(aNums.get(i), bNums.get(i), cNums.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
