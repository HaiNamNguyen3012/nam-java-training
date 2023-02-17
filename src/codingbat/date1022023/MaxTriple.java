package codingbat.date1022023;

import java.util.Scanner;

public class MaxTriple {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int maxTriple(int[] nums) {
		  int middleElement = (nums.length-1)/2;
		  int newArr[] = new int[3];
		  newArr[0] = nums[0];
		  newArr[1] = nums[middleElement];
		  newArr[2] = nums[nums.length-1];
		  int max = 0;
		  for(int i = 0; i < 3; i++){
		    if(max < newArr[i]) 
		      max = newArr[i];
		  }
		  return max;
	}
	
	public static void solve() {
		System.out.println("Please enter array's length you want");
		int len = sc.nextInt();
		int nums[] = new int[len];
		System.out.println("Please enter values of all array's elements");
		for(int i = 0; i < len; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.print("Input of maxTriple: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.println("Output of maxTriple: " + maxTriple(nums));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
