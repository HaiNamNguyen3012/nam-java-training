package codingbat.date1522023;

import java.util.ArrayList;
import java.util.Scanner;

public class CatDog {
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean catDog(String str) {
		  int cat = 0;
		  int dog = 0;
		  for(int i = 0; i < str.length() - 2; i++){
		    if(str.substring(i, i+3).equals("cat")) cat++;
		    if(str.substring(i, i+3).equals("dog")) dog++;
		  }
		  return (cat==dog);
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
			System.out.println("Input of catDog: " + strings.get(i));
			System.out.println("Output of catDog: " + catDog(strings.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
