/**
 * 
 */
package codingbat.date222023;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Dell
 *
 */
public class SleepIn {
	private static Scanner scanner = new Scanner(System.in);
	
	public static boolean sleepIn(boolean weekday, boolean vacation) {
		if(weekday == false || vacation == true){
			return true;
		}
		return false;
	}	
	public static void solve(){
		ArrayList<Boolean> weekdays = new ArrayList<Boolean>();
		ArrayList<Boolean> vacations = new ArrayList<Boolean>();
		int numberOfTestCases = 4;
		System.out.println("This problem has only 4 testcases. Please enter those testcases:");
		for(int i = 0; i < numberOfTestCases; i++) {
			boolean weekday = scanner.nextBoolean();
			boolean vacation = scanner.nextBoolean();
			weekdays.add(weekday);
			vacations.add(vacation);
		}
		
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of SleepIn: " + weekdays.get(i) + " " +  vacations.get(i));
			System.out.println("Output of SleepIn: " + sleepIn(weekdays.get(i), vacations.get(i)));
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
