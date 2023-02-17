package codingbat.date922023;

import java.util.Scanner;

public class RotateLeft3 {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int[] rotateLeft3(int[] nums) {
		  return new int[] {nums[1], nums[2], nums[0]};
	}
	
	public static void solve() {
		System.out.println("Please enter array's length you want");
		int len = sc.nextInt();
		int nums[] = new int[len];
		System.out.println("Please enter values of all array's elements");
		for(int i = 0; i < len; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.print("Input of rotateLeft3: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		int[] result = rotateLeft3(nums);
		System.out.print("Output of rotateLeft3: ");
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
