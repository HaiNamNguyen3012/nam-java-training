package codingbat.date1622023;

import java.util.ArrayList;
import java.util.Scanner;

public class ZipZap {
	
	private static Scanner sc = new Scanner(System.in); 
	
	public static String zipZap(String str) {
		  if(str.length() == 3 && str.charAt(0) == 'z' && str.charAt(2) == 'p') return "zp";
		  else if(str.length() < 3 || str.length() == 3 && (str.charAt(0) != 'z' || str.charAt(2) == 'p')) return str; 
		  String result = "";
		  result = result + str.charAt(0);
		  for(int i = 1; i < str.length(); i++){
		      if(str.charAt(i-1) == 'z' && str.charAt(i+1) == 'p'){
		        continue;
		      }
		      result = result + str.charAt(i);
		  }
		  
		  return result;
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
			System.out.println("Input of zipZap: " + strings.get(i));
			System.out.println("Output of zipZap: " + zipZap(strings.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
