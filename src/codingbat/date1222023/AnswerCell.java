package codingbat.date1222023;

import java.util.ArrayList;
import java.util.Scanner;

public class AnswerCell {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		  return (isMom && !isAsleep || !isMorning && !isAsleep);
	}
	
	public static void solve() {
		ArrayList<Boolean> isMornings = new ArrayList<Boolean>();
		ArrayList<Boolean> isMoms = new ArrayList<Boolean>();
		ArrayList<Boolean> isAsleeps = new ArrayList<Boolean>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			boolean isMorning = sc.nextBoolean();
			isMornings.add(isMorning);
			boolean isMom = sc.nextBoolean();
			isMoms.add(isMom);
			boolean isAsleep = sc.nextBoolean();
			isAsleeps.add(isAsleep);
		}
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of answerCell: " + isMornings.get(i) + " " + isMoms.get(i) + " " + isAsleeps.get(i));
			System.out.println("Output of answerCell: " + answerCell(isMornings.get(i), isMoms.get(i), isAsleeps.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
