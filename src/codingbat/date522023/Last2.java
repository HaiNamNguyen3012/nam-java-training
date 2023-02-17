package codingbat.date522023;

import java.util.ArrayList;
import java.util.Scanner;

public class Last2 {
	private static Scanner sc = new Scanner(System.in);
	public static int last2(String str) {
		  if(str.length() <= 1) return 0;
		  String lastChildString = str.substring(str.length()-2);
		  int count = 0;
		  for(int i = 0; i < str.length()-2; i++){
		    if(str.substring(i, i+2).equals(lastChildString)){
		      count++;
		    }
		  }
		  return count;
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
			System.out.println("Input of last2: " + strings.get(i));
			System.out.println("Output of last2: " + last2(strings.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
