package codingbat.date1222023;

import java.util.ArrayList;
import java.util.Scanner;

public class Less20 {
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean less20(int n) {
	  return (n % 20 == 18 || n % 20 == 19);
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
			System.out.println("Input of less20: " + nums.get(i));
			System.out.println("Output of less20: " + less20(nums.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}
}
