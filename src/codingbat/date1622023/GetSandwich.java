package codingbat.date1622023;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSandwich {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static String getSandwich(String str) {
		  if(str.length() < 10) return "";
		  int first = -1;
		  int last = -1;
		      
		  for(int i = 0; i < str.length() - 5; i++) {
		      if(str.substring(i, i + 5).equals("bread")) {
		          first = i;
		          break;
		      }
		  }
		  for(int i = str.length() - 5; i >= 0; i--) {
		      if(str.substring(i, i + 5).equals("bread")) {
		          last = i;
		          break;
		      }
		  }
		  if(first != -1 && last != -1 && first != last)
		    return str.substring(first + 5, last);
		  return "";
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
			System.out.println("Input of getSandwich: " + strings.get(i));
			System.out.println("Output of getSandwich: " + getSandwich(strings.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
