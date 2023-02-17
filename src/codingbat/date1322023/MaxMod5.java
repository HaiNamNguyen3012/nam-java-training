package codingbat.date1322023;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxMod5 {
	private static Scanner sc = new Scanner(System.in);
	
	public static int maxMod5(int a, int b) {
		  if(a == b) return 0;
		  else if(a%5 == b%5) return Math.min(a,b);
		  return Math.max(a,b);
	}
	
	public static void solve() {
		ArrayList<Integer> aNums = new ArrayList<Integer>();
		ArrayList<Integer> bNums = new ArrayList<Integer>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			int aNum = sc.nextInt();
			aNums.add(aNum);
			int bNum = sc.nextInt();
			bNums.add(bNum);
		}
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of maxMod5: " + aNums.get(i) + " " + bNums.get(i));
			System.out.println("Output of maxMod5: " + maxMod5(aNums.get(i), bNums.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
