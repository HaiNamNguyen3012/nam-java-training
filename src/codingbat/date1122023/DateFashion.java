package codingbat.date1122023;

import java.util.ArrayList;
import java.util.Scanner;

public class DateFashion {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int dateFashion(int you, int date) {
		  if(you <= 2|| date <=2) return 0;
		  else if(8 <= you && you <= 10 || 8 <= date && date <= 10) return 2;
		  return 1;
	}
	
	public static void solve() {
		ArrayList<Integer> variables1 = new ArrayList<Integer>();
		ArrayList<Integer> variables2 = new ArrayList<Integer>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			int variable1 = sc.nextInt();
			variables1.add(variable1);
			int variable2 = sc.nextInt();
			variables2.add(variable2);
		}
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of dateFashion: " + variables1.get(i) + " " + variables2.get(i));
			System.out.println("Output of dateFashion: " + dateFashion(variables1.get(i), variables2.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
