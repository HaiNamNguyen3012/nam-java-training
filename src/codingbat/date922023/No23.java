package codingbat.date922023;

import java.util.Scanner;

public class No23 {
	
	private static Scanner sc = new Scanner(System.in);

	public static boolean no23(int[] nums) {
		  return !(nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3);
	}
	
	public static void solve() {
		System.out.println("Please enter array's length you want");
		int len = sc.nextInt();
		int nums[] = new int[len];
		System.out.println("Please enter values of all array's elements");
		for(int i = 0; i < len; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.print("Input of no23: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.println("Output of no23: " + no23(nums));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
