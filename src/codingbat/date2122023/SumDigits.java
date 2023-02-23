package codingbat.date2122023;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *Name: SumDigits
 *Description:  Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other
 *characters.Return 0 if there are no digits in the string.
 *(Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
 *Integer.parseInt(string) converts a string to an int.)
 */

public class SumDigits {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	//Hàm tính tổng các kí tự là số
	public static int sumDigits(String str) {
		//Khai báo biến tổng các kí tự là số
		int result = 0;
		
		//Xử lý chuỗi
		for(int i = 0; i < str.length(); i++){
		  if(Character.isDigit(str.charAt(i))){
		    result += Integer.parseInt(str.substring(i, i+1));
		  }
		}
		return result;
	}
	
	//Hàm xử lý dữ liệu
	public static void solve() {
		// Khai báo 1 String ArrayList để chứa tham số truyền vào của testcase
		ArrayList<String> strings = new ArrayList<String>();
		//Nhập dữ liệu từ bàn phím
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			String string = sc.nextLine();
			strings.add(string);
		}
		//In ra input và output
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of sumDigits: " + strings.get(i));
			System.out.println("Output of sumDigits: " + sumDigits(strings.get(i)));
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
