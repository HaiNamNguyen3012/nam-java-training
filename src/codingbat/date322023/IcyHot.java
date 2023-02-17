package codingbat.date322023;

import java.util.ArrayList;
import java.util.Scanner;

public class IcyHot {

	private static Scanner sc = new Scanner(System.in);
	
	public static boolean icyHot(int temp1, int temp2) {
		  return ((temp1 > 100 && temp2 < 0) || (temp1 < 0 && temp2 > 100));
	}
	
	public static void solve() {
		ArrayList<Integer> temperatures1 = new ArrayList<Integer>();
		ArrayList<Integer> temperatures2 = new ArrayList<Integer>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			int temperature1 = sc.nextInt();
			temperatures1.add(temperature1);
			int temperature2 = sc.nextInt();
			temperatures2.add(temperature2);
		}
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of icyHot: " + temperatures1.get(i) + " " + temperatures2.get(i));
			System.out.println("Output of icyHot: " + icyHot(temperatures1.get(i), temperatures2.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
