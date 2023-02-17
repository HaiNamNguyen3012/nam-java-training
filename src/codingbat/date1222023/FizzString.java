package codingbat.date1222023;

import java.util.ArrayList;
import java.util.Scanner;

public class FizzString {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static String fizzString(String str) {
		  if(str.charAt(0) == 'f' && str.charAt(str.length()-1) == 'b') return "FizzBuzz";
		  else if(str.charAt(0) == 'f') return "Fizz";
		  else if(str.charAt(str.length()-1) == 'b') return "Buzz";
		  return str;
	}
	
	public static void solve() {
		ArrayList<String> strings = new ArrayList<String>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			String string = sc.nextLine();
			strings.add(string);
		}
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of fizzString: " + strings.get(i));
			System.out.println("Output of fizzString: " + fizzString(strings.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
