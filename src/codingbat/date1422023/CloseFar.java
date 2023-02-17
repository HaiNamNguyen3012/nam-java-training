package codingbat.date1422023;

import java.util.ArrayList;
import java.util.Scanner;

public class CloseFar {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean closeFar(int a, int b, int c) {
		  int diff1 = Math.abs(a - b);
		  int diff2 = Math.abs(a - c);
		  int diff3 = Math.abs(b - c);
		  if(diff1 <= 1 && diff2 >=2 && diff3 >=2 || diff2 <= 1 && diff1 >=2 && diff3 >=2) return true;
		  // else if() return true;
		  else return false;
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
			System.out.println("Input of closeFar: " + aNums.get(i) + " " + bNums.get(i)+ " " + cNums.get(i));
			System.out.println("Output of closeFar: " + closeFar(aNums.get(i), bNums.get(i), cNums.get(i)));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
