package codingbat.date1422023;

import java.util.ArrayList;
import java.util.Scanner;

public class BlackJack {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int blackjack(int a, int b) {
		  if(a > 21 && b > 21) return 0;
		  else if(a > 21) return b;
		  else if(b > 21) return a;
		  else{
		    int result1 = 21 - a;
		    int result2 = 21 - b;
		    if(result1 < result2) return a;
		    return b;
		  }
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
			System.out.println("Input of blackjack: " + aNums.get(i) + " " + bNums.get(i));
			System.out.println("Output of blackjack: " + blackjack(aNums.get(i), bNums.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
