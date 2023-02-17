package codingbat.date1122023;

import java.util.ArrayList;
import java.util.Scanner;

public class Love6 {
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean love6(int a, int b) {
		  int sum = a+b;
		  int dif = Math.abs(a-b);
		  // if return true;
		  return (a == 6 || b == 6 || sum == 6 || dif == 6);
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
			System.out.println("Input of love6: " + aNums.get(i) + " " + bNums.get(i));
			System.out.println("Output of love6: " + love6(aNums.get(i), bNums.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
