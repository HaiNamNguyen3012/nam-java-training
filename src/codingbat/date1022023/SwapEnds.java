package codingbat.date1022023;

import java.util.Scanner;

public class SwapEnds {

	private static Scanner sc = new Scanner(System.in);
	
	public static int[] swapEnds(int[] nums) {
		  int temp = nums[0];
		  nums[0] = nums[nums.length-1];
		  nums[nums.length-1] = temp;
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
		System.out.print("Input of swapEnds: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.print("Output of swapEnds: ");
		int[] result = swapEnds(nums);
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
