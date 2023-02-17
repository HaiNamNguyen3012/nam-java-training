package codingbat.date1122023;

import java.util.ArrayList;
import java.util.Scanner;

public class CigarParty {
	
	private static Scanner sc = new Scanner(System.in); 
	
	public static boolean cigarParty(int cigars, boolean isWeekend) {
		  if(!isWeekend && 40 <= cigars && cigars <= 60 || isWeekend && 40 <= cigars) return true;
		  return false;
	}
	
	public static void solve() {
		ArrayList<Integer> cigars = new ArrayList<Integer>();
		ArrayList<Boolean> isWeekends = new ArrayList<Boolean>();
		
		System.out.println("Please enter number of testcases you want: ");
		int numberOfTestCases = sc.nextInt();
		
		for(int i = 0; i < numberOfTestCases; i++) {
			int cigar = sc.nextInt();
			cigars.add(cigar);
			boolean isWeekend = sc.nextBoolean();
			isWeekends.add(isWeekend);
		}
		
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of cigarParty: " + cigars.get(i) + " " + isWeekends.get(i));
			System.out.println("Output of cigarParty: " + cigarParty(cigars.get(i), isWeekends.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
