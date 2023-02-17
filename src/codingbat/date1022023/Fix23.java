package codingbat.date1022023;

import java.util.Scanner;

public class Fix23 {
	private static Scanner sc = new Scanner(System.in);
	
	public static int[] fix23(int[] nums) {
		  for(int i = 0; i < nums.length - 1; i++){
		    if(nums[i] == 2 && nums[i+1] == 3) nums[i+1] = 0;
		  }
		  return nums;
	}
	public static void solve() {
		System.out.println("Please enter array's length you want");
		int len = sc.nextInt();
		int nums[] = new int[len];
		System.out.println("Please enter values of all array's elements");
		for(int i = 0; i < len; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.print("Input of fix23: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		int[] result = fix23(nums);
		System.out.print("Output of fix23: ");
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
