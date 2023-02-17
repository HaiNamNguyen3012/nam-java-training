package codingbat.date1222023;

import java.util.ArrayList;
import java.util.Scanner;

public class TeenSum {
	private static Scanner sc = new Scanner(System.in);
	
	public static int teenSum(int a, int b) {
		  if(13 <= a && a <= 19 || 13 <= b && b <= 19) return 19;
		  return a+b;
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
			System.out.println("Input of teenSum: " + aNums.get(i) + " " + bNums.get(i));
			System.out.println("Output of teenSum: " + teenSum(aNums.get(i), bNums.get(i)));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
