package codingbat.date822023;

import java.util.Scanner;

public class SameFirstLast {
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean sameFirstLast(int[] nums) {
		  if(nums.length > 1 && nums[0] == nums[nums.length - 1] || nums.length == 1) return true;
		  return false;
	}
	
	public static void solve() {
		System.out.println("Please enter array's length you want");
		int len = sc.nextInt();
		int nums[] = new int[len];
		System.out.println("Please enter values of all array's elements");
		for(int i = 0; i < len; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.print("Input of sameFirstLast: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.println("Output of sameFirstLast: " + sameFirstLast(nums));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
