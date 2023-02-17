package codingbat.date522023;

import java.util.Scanner;

public class ArrayFront9 {
	private static Scanner sc = new Scanner(System.in);
	public static boolean arrayFront9(int[] nums) {
		  int newLength = 4;
		  int count = 0;
		  if(newLength > nums.length){
		    newLength = nums.length;
		  }
		  for(int i = 0; i < newLength; i++){
		    if(nums[i] == 9){
		      count++;
		    }
		  }
		  if(count == 0) return false;
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
		System.out.print("Input of arrayFront9: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.println("Output of arrayFront9: " + arrayFront9(nums));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
