package codingbat.date222023;

import java.util.ArrayList;
import java.util.Scanner;

public class FrontBack {
	private static Scanner sc = new Scanner(System.in);
	
	public static String frontBack(String str) {
		String newStr = "";
		if(str.length() <= 3){
			for(int i = str.length()-1; i >= 0 ; i--){
		      newStr+=str.charAt(i);
		    }
		}
		else{
		  newStr+=str.charAt(str.length()-1);
		  for(int i = 1; i < str.length()-1; i++){
		    newStr+=str.charAt(i);
		  }
		    newStr+=str.charAt(0);
		 }
		 return newStr;
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
			System.out.println("Input of frontBack: " + strings.get(i));
			System.out.println("Output of frontBack: " + frontBack(strings.get(i)));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
