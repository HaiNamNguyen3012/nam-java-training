package codingbat.date1122023;

import java.util.ArrayList;
import java.util.Scanner;

public class More20 {
private static Scanner sc = new Scanner(System.in);
	
	public static boolean more20(int n) {
	  return (n%20 == 1 || n%20 == 2);
	}
	
	public static void solve() {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			int num = sc.nextInt();
			nums.add(num);
		}
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of more20: " + nums.get(i));
			System.out.println("Output of more20: " + more20(nums.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}
}
