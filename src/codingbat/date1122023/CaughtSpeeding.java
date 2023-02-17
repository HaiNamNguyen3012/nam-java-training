package codingbat.date1122023;

import java.util.ArrayList;
import java.util.Scanner;

public class CaughtSpeeding {
	
	private static Scanner sc = new Scanner(System.in);
	public static int caughtSpeeding(int speed, boolean isBirthday) {
		  if(isBirthday) {
		      if(speed <= 65) {
		          return 0;
		      } else if(66 <= speed && speed <= 85) {
		          return 1;
		      } else if(86 <=  speed) {
		          return 2;
		      }
		  }
		  if(speed <= 60) {
		      return 0;
		  } else if(61 <= speed && speed <= 80) {
		      return 1;
		  } else {
		      return 2;
		  }
	}
	
	public static void solve() {
		ArrayList<Integer> speeds = new ArrayList<Integer>();
		ArrayList<Boolean> isBirthdays = new ArrayList<Boolean>();
		
		System.out.println("Please enter number of testcases you want: ");
		int numberOfTestCases = sc.nextInt();
		
		for(int i = 0; i < numberOfTestCases; i++) {
			int speed = sc.nextInt();
			speeds.add(speed);
			boolean isBirthday = sc.nextBoolean();
			isBirthdays.add(isBirthday);
		}
		
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of caughtSpeeding: " + speeds.get(i) + " " + isBirthdays.get(i));
			System.out.println("Output of caughtSpeeding: " + caughtSpeeding(speeds.get(i), isBirthdays.get(i)));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
