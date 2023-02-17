package codingbat.date1622023;

import java.util.ArrayList;
import java.util.Scanner;

public class XyzMiddle {
	
	private static Scanner sc = new Scanner(System.in);
	public static boolean xyzMiddle(String str) {
		  if(str.length() < 3) return false;
		  int len = str.length()/2;
		  if(str.length()%2==0){
		    if(str.substring(len-2, len+1).equals("xyz") || str.substring(len-1, len+2).equals("xyz")){
		      return true;
		    }
		  }
		  return (str.substring(len-1, len+2).equals("xyz"));
	}
	
	public static void solve() {
		ArrayList<String> strings = new ArrayList<String>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			String string = sc.next();
			strings.add(string);
		}
		
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of xyzMiddle: " + strings.get(i));
			System.out.println("Output of xyzMiddle: " + xyzMiddle(strings.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
