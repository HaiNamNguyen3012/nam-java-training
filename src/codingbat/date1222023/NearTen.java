package codingbat.date1222023;

import java.util.ArrayList;
import java.util.Scanner;

public class NearTen {
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean nearTen(int num) {
		  return (num%10 <= 2|| num%10  >= 8);
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
			System.out.println("Input of nearTen: " + nums.get(i));
			System.out.println("Output of nearTen: " + nearTen(nums.get(i)));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
