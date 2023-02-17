package codingbat.date1022023;

import java.util.Scanner;

public class Unlucky1 {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean unlucky1(int[] nums) {
		  if(nums.length <= 1) return false;
		  if(nums[0] == 1 && nums[1] == 3 || nums[1] == 1 && nums[2] == 3 || nums[nums.length-2] == 1 && nums[nums.length-1] == 3){
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
		System.out.print("Input of unlucky1: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.println("Output of unlucky1: " + unlucky1(nums));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
