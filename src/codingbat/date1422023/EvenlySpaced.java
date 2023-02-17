package codingbat.date1422023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EvenlySpaced {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean evenlySpaced(int a, int b, int c) {
		  int arr[] = {a,b,c};
		  Arrays.sort(arr);
		  int diff1 = Math.abs(arr[0] - arr[1]);
		  int diff2 = Math.abs(arr[1] - arr[2]);
		  
		  return (diff1 == diff2);
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
			System.out.println("Input of evenlySpaced: " + aNums.get(i) + " " + bNums.get(i)+ " " + cNums.get(i));
			System.out.println("Output of evenlySpaced: " + evenlySpaced(aNums.get(i), bNums.get(i), cNums.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
