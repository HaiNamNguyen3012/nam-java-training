package codingbat.date1122023;

import java.util.ArrayList;
import java.util.Scanner;

public class AlarmClock {
	private static Scanner sc = new Scanner(System.in);
	public static String alarmClock(int day, boolean vacation) {
		  if((vacation && day == 0) || (vacation && day == 6)) return "off";
		  else if((vacation && 1 <= day && day <= 5) || (!vacation && day == 0) || (!vacation && day == 6)) return "10:00";
		  return "7:00";
	}
	
	public static void solve() {
		ArrayList<Integer> days = new ArrayList<Integer>();
		ArrayList<Boolean> vacations = new ArrayList<Boolean>();
		
		System.out.println("Please enter number of testcases you want: ");
		int numberOfTestCases = sc.nextInt();
		
		for(int i = 0; i < numberOfTestCases; i++) {
			int day = sc.nextInt();
			days.add(day);
			boolean vacation = sc.nextBoolean();
			vacations.add(vacation);
		}
		
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of alarmClock: " + days.get(i) + " " + vacations.get(i));
			System.out.println("Output of alarmClock: " + alarmClock(days.get(i), vacations.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
