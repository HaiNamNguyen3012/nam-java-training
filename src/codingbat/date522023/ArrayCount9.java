package codingbat.date522023;

import java.util.Scanner;

public class ArrayCount9 {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int arrayCount9(int[] nums) {
		  int count = 0;
		  for(int i = 0; i < nums.length; i++){
		    if(nums[i] == 9){
		      count++;
		    }
		  }
		  return count;
	}
	
	public static void solve() {
		System.out.println("Please enter array's length you want");
		int len = sc.nextInt();
		int nums[] = new int[len];
		System.out.println("Please enter values of all array's elements");
		for(int i = 0; i < len; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.print("Input of arrayCount9: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.println("Output of arrayCount9: " + arrayCount9(nums));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
