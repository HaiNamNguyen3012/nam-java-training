package codingbat.date1022023;

import java.util.Scanner;

public class FrontPiece {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int[] frontPiece(int[] nums) {
		  if(nums.length <= 2){
		   return nums; 
		  }
		  return new int[] {nums[0], nums[1]};
	}
	
	public static void solve() {
		System.out.println("Please enter array's length you want");
		int len = sc.nextInt();
		int nums[] = new int[len];
		System.out.println("Please enter values of all array's elements");
		for(int i = 0; i < len; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.print("Input of frontPiece: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.print("Output of frontPiece: ");
		int[] result = frontPiece(nums);
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
