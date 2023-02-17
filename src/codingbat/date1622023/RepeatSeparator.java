package codingbat.date1622023;

import java.util.ArrayList;
import java.util.Scanner;

public class RepeatSeparator {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static String repeatSeparator(String word, String sep, int count) {
		  String result = "";
		  if(count == 0) return result;
		  for(int i = 1; i < count; i++){
		    result = result + word + sep;
		  }
		  return result + word;
	}
	
	public static void solve() {
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<String> seps = new ArrayList<String>();
		ArrayList<Integer> counts = new ArrayList<Integer>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			String word = sc.next();
			words.add(word);
			String sep = sc.next();
			seps.add(sep);
			int count = sc.nextInt();
			counts.add(count);
		}
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of repeatSeparator: " + words.get(i) + " " + seps.get(i) + " " + counts.get(i));
			System.out.println("Output of repeatSeparator: " + repeatSeparator(words.get(i), seps.get(i), counts.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
