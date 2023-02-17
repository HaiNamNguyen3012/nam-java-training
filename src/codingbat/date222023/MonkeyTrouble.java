package codingbat.date222023;

import java.util.ArrayList;
import java.util.Scanner;

public class MonkeyTrouble {
	private static Scanner sc = new Scanner(System.in);
	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		if(aSmile == true && bSmile == true || aSmile == false && bSmile == false){
		    return true;
		}
		return false;
	}
	public static void solve() {
		ArrayList<Boolean> aSmiles = new ArrayList<Boolean>();
		ArrayList<Boolean> bSmiles = new ArrayList<Boolean>();
		int numberOfTestCases = 4;
		System.out.println("This problem has only 4 testcases. Please enter those testcases:");
		for(int i = 0; i < numberOfTestCases; i++) {
			boolean aSmile = sc.nextBoolean();
			boolean bSmile = sc.nextBoolean();
			aSmiles.add(aSmile);
			bSmiles.add(bSmile);
		}
		
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of Monkey Trouble: " + aSmiles.get(i) + " " +  bSmiles.get(i));
			System.out.println("Output of Monkey Trouble: " + monkeyTrouble(aSmiles.get(i), bSmiles.get(i)));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
