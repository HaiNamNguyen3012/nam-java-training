package codingbat.date1022023;

import java.util.Scanner;

public class MidThree {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int[] midThree(int[] nums) {
		  int middleLength = (nums.length-1)/2;
		  return new int[] {nums[middleLength-1],nums[middleLength],nums[middleLength+1]};
	}
	
	public static void solve() {
		System.out.println("Please enter array's length you want");
		int len = sc.nextInt();
		int nums[] = new int[len];
		System.out.println("Please enter values of all array's elements");
		for(int i = 0; i < len; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.print("Input of midThree: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.print("Output of midThree: ");
		int[] result = midThree(nums);
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
