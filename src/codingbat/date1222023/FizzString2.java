package codingbat.date1222023;

import java.util.ArrayList;
import java.util.Scanner;

public class FizzString2 {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static String fizzString2(int n) {
		  if(n%3 == 0 && n%5 == 0) return "FizzBuzz!";
		  else if(n%3 == 0) return "Fizz!";
		  else if(n%5 == 0) return "Buzz!";
		  return n + "!";
	}
	
	public static void solve() {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			int num = sc.nextInt();
			nums.add(num);
		}
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of fizzString2: " + nums.get(i));
			System.out.println("Output of fizzString2: " + fizzString2(nums.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
