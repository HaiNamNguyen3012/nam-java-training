package codingbat.date322023;

import java.util.ArrayList;
import java.util.Scanner;

public class Or35 {
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean or35(int n) {
		  return (n%3==0||n%5==0);
	}
	
	public static void solve() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			int num = sc.nextInt();
			numbers.add(num);
		}
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of or35: " + numbers.get(i));
			System.out.println("Output of or35: " + or35(numbers.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}
}
