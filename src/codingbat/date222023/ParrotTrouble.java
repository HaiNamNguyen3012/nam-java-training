package codingbat.date222023;

import java.util.ArrayList;
import java.util.Scanner;

public class ParrotTrouble {
	private static Scanner sc = new Scanner(System.in);
	public static boolean parrotTrouble(boolean talking, int hour) {
		if(talking == true && (hour < 7 || hour > 20)){
		  return true;
		}
		return false;
	}
	
	public static void solve() {
		ArrayList<Boolean> talkings = new ArrayList<Boolean>();
		ArrayList<Integer> hours = new ArrayList<Integer>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			boolean talking = sc.nextBoolean();
			talkings.add(talking);
			int hour = sc.nextInt();
			hours.add(hour);
		}
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of Parrot Trouble: " + talkings.get(i) + " " +  hours.get(i));
			System.out.println("Output of Parrot Trouble: " + parrotTrouble(talkings.get(i), hours.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
