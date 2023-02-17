package codingbat.date1422023;

import java.util.ArrayList;
import java.util.Scanner;

public class MakeChocolate {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int makeChocolate(int small, int big, int goal) {
		  int remainder;
		  if(goal >= 5 * big){
		    remainder = goal - 5 * big;
		  } else{
		    remainder = goal % 5;
		  }
		  if (remainder <= small) return remainder;
		  return -1;
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
			System.out.println("Input of makeChocolate: " + aNums.get(i) + " " + bNums.get(i)+ " " + cNums.get(i));
			System.out.println("Output of makeChocolate: " + makeChocolate(aNums.get(i), bNums.get(i), cNums.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
