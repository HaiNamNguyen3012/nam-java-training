package codingbat.date922023;

import java.util.Scanner;

public class MaxEnd3 {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int[] maxEnd3(int[] nums) {
		  int largerNumber = nums[0];
		  int result[] = new int[nums.length];
		  if(largerNumber < nums[nums.length-1]){
		    largerNumber = nums[nums.length-1];
		  }
		  
		  for(int i = 0; i < result.length; i++){
		    result[i] = largerNumber;
		  }
		  return result;
	}
	
	public static void solve() {
		System.out.println("Please enter array's length you want");
		int len = sc.nextInt();
		int nums[] = new int[len];
		System.out.println("Please enter values of all array's elements");
		for(int i = 0; i < len; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.print("Input of maxEnd3: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		int[] result = maxEnd3(nums);
		System.out.print("Output of maxEnd3: ");
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
