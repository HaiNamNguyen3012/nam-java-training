package codingbat.date922023;

import java.util.Scanner;

public class Sum3 {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int sum3(int[] nums) {
		  int sum = 0;
		  for(int i = 0; i < 3; i++){
		    sum+=nums[i];
		  }
		  return sum;
	}
	
	public static void solve() {
		System.out.println("Please enter array's length you want");
		int len = sc.nextInt();
		int nums[] = new int[len];
		System.out.println("Please enter values of all array's elements");
		for(int i = 0; i < len; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.print("Input of sum3: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.println("Output of sum3: " + sum3(nums));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
