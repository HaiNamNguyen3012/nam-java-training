package codingbat.date922023;

import java.util.Scanner;

public class MakeLast {
	private static Scanner sc = new Scanner(System.in);
	public static int[] makeLast(int[] nums) {
		  int len = nums.length;
		  int newArr[] = new int[len*2];
		  for(int i = 0; i < len-1; i++){
		    newArr[i] = 0;
		  }
		  newArr[len*2-1] = nums[nums.length-1];
		  return newArr;
	}
	
	public static void solve() {
		System.out.println("Please enter array's length you want");
		int len = sc.nextInt();
		int nums[] = new int[len];
		System.out.println("Please enter values of all array's elements");
		for(int i = 0; i < len; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.print("Input of MakeLast: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		int[] result = makeLast(nums);
		System.out.print("Output of makeLast: ");
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
