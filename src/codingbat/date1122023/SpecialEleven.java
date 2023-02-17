package codingbat.date1122023;

import java.util.ArrayList;
import java.util.Scanner;

public class SpecialEleven {
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean specialEleven(int n) {
		  return (n%11==0 || n%11 == 1);
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
			System.out.println("Input of specialEleven: " + nums.get(i));
			System.out.println("Output of specialEleven: " + specialEleven(nums.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
