package codingbat.date1422023;

import java.util.ArrayList;
import java.util.Scanner;

public class LoneSum {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int loneSum(int a, int b, int c) {
		  if( a == b && b == c) return 0;
		  else if(a != b && b == c) return a;
		  else if(a == b && b != c) return c;
		  else if(a != b && a == c) return b;
		  return a+b+c;
	}
	
	public static void solve() {
		ArrayList<Integer> aNums = new ArrayList<Integer>();
		ArrayList<Integer> bNums = new ArrayList<Integer>();
		ArrayList<Integer> cNums = new ArrayList<Integer>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			int aNum = sc.nextInt();
			aNums.add(aNum);
			int bNum = sc.nextInt();
			bNums.add(bNum);
			int cNum = sc.nextInt();
			cNums.add(cNum);
		}
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of loneSum: " + aNums.get(i) + " " + bNums.get(i)+ " " + cNums.get(i));
			System.out.println("Output of loneSum: " + loneSum(aNums.get(i), bNums.get(i), cNums.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
