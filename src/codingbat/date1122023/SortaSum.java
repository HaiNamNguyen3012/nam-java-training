package codingbat.date1122023;

import java.util.ArrayList;
import java.util.Scanner;

public class SortaSum {
	private static Scanner sc = new Scanner(System.in);	
	public static int sortaSum(int a, int b) {
		  int sum = a+b;
		  if(10 <= sum && sum <= 19) return 20;
		  return sum;
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
			System.out.println("Input of sortaSum: " + aNums.get(i) + " " + bNums.get(i));
			System.out.println("Output of sortaSum: " + sortaSum(aNums.get(i), bNums.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
