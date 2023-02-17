package codingbat.date922023;

import java.util.Scanner;

public class Sum2 {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int sum2(int[] nums) {
		  if(nums.length == 0) return 0;
		  else if(nums.length == 1) return nums[0];
		  return nums[0] + nums[1];
	}
	
	public static void solve() {
		System.out.println("Please enter array's length you want");
		int len = sc.nextInt();
		int nums[] = new int[len];
		System.out.println("Please enter values of all array's elements");
		for(int i = 0; i < len; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.print("Input of sum2: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.println("Output of sum2: " + sum2(nums));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
