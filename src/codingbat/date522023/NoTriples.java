package codingbat.date522023;

import java.util.Scanner;

public class NoTriples {
	
	private static Scanner sc = new Scanner(System.in);

	public static boolean noTriples(int[] nums) {
		  int count = 0;
		  for(int i = 1; i < nums.length - 1; i++){
		    if(nums[i] == nums[i-1] && nums[i] == nums[i+1]){
		      count++;
		    }
		  }
		  if(count == 0){
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
		System.out.print("Input of noTriples: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.println("Output of noTriples: " + noTriples(nums));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
