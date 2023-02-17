package codingbat.date1322023;

import java.util.ArrayList;
import java.util.Scanner;

public class RedTicket {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int redTicket(int a, int b, int c) {
		  if(a == 2 && b == 2 && c == 2) return 10;
		  if(a == b && b == c) return 5;
		  if(a != b && a != c) return 1;
		  return 0;
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
			System.out.println("Input of redTicket: " + aNums.get(i) + " " + bNums.get(i) + " " + cNums.get(i));
			System.out.println("Output of redTicket: " + redTicket(aNums.get(i), bNums.get(i), cNums.get(i)));
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
