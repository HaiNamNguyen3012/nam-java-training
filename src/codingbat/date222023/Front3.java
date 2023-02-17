package codingbat.date222023;

import java.util.ArrayList;
import java.util.Scanner;

public class Front3 {
	private static Scanner sc = new Scanner(System.in);
	
	public static String front3(String str) {
		if(str.length() < 3){
		    return str+str+str;    
		}
		String str1 = "";
		for(int i = 0; i < 3; i++){
		  str1+=str.charAt(i);
		}
		return str1+str1+str1;
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
			System.out.println("Input of front3: " + strings.get(i));
			System.out.println("Output of front3: " + front3(strings.get(i)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
