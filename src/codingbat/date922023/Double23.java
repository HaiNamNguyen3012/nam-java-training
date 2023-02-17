package codingbat.date922023;

import java.util.Scanner;

public class Double23 {
	private static Scanner sc = new Scanner(System.in);
	public static boolean double23(int[] nums) {
		  if(nums.length == 2 && nums[0] == 2 && nums[1] == 2 || nums.length == 2 && nums[0] == 3 && nums[1] == 3){
		    return true;
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
		System.out.print("Input of double23: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.println("Output of double23: " + double23(nums));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
