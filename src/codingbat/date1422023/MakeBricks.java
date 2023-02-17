package codingbat.date1422023;

import java.util.ArrayList;
import java.util.Scanner;

public class MakeBricks {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean makeBricks(int small, int big, int goal) {
		int digit  = goal % 10;
		if (goal > small + (big * 5))
			return false;
		if (digit < 5 && small < digit)
		    return false;
		else if (digit > 5 && digit > small + 5)
		    return false;
		else
		    return true;

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
			System.out.println("Input of makeBricks: " + aNums.get(i) + " " + bNums.get(i)+ " " + cNums.get(i));
			System.out.println("Output of makeBricks: " + makeBricks(aNums.get(i), bNums.get(i), cNums.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
