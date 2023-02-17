package codingbat.date522023;

import java.util.Scanner;

public class Array123 {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean array123(int[] nums) {
		  int count = 0;
		  for(int i = 1; i < nums.length - 1; i++){
		    if(nums[i-1] == 1 && nums[i] == 2 && nums[i+1] == 3){
		      count++;
		    }
		  }
		  if(count==0) return false;
		  return true;
	}
	
	public static void solve() {
		System.out.println("Please enter array's length you want");
		int len = sc.nextInt();
		int nums[] = new int[len];
		System.out.println("Please enter values of all array's elements");
		for(int i = 0; i < len; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.print("Input of arrayCount123: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.println("Output of arrayCount123: " + array123(nums));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
