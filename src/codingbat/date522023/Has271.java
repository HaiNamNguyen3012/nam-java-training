package codingbat.date522023;

import java.util.Scanner;

public class Has271 {
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean has271(int[] nums) {
		  for(int i = 0; i < nums.length - 2; i++){
		    if(nums[i]+5 == nums[i+1] && 2 >= Math.abs((nums[i+2] - (nums[i] - 1)))){
		      return true;
		    };
		  }
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
		System.out.print("Input of has271: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.println("Output of has271: " + has271(nums));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}
}
