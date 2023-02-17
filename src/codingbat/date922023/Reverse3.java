package codingbat.date922023;

import java.util.Scanner;

public class Reverse3 {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int[] reverse3(int[] nums) {
		  int[] result = new int[3];
		  int j = 0;
		  for(int i = nums.length - 1; i >= 0; i--){
		    result[j] = nums[i];
		    j++;
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
		System.out.print("Input of reverse3: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		int[] result = reverse3(nums);
		System.out.print("Output of reverse3: ");
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
