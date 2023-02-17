package codingbat.date1122023;

import java.util.ArrayList;
import java.util.Scanner;

public class In1To10 {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean in1To10(int n, boolean outsideMode) {
		  return (outsideMode && n <= 1  ||outsideMode && n >= 10 || !outsideMode && n >= 1  && n <= 10);
	}
	
	public static void solve() {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		ArrayList<Boolean> outsideModes = new ArrayList<Boolean>();
		
		System.out.println("Please enter number of testcases you want: ");
		int numberOfTestCases = sc.nextInt();
		
		for(int i = 0; i < numberOfTestCases; i++) {
			int num = sc.nextInt();
			nums.add(num);
			boolean outsideMode = sc.nextBoolean();
			outsideModes.add(outsideMode);
		}
		
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of in1To10: " + nums.get(i) + " " + outsideModes.get(i));
			System.out.println("Output of in1To10: " + in1To10(nums.get(i), outsideModes.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
