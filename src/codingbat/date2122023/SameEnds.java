package codingbat.date2122023;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Name: sameEnds
 * Description: Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping.
 * For example, sameEnds("abXab") is "ab".
 */

public class SameEnds {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	//Hàm kiểm tra chuỗi con dài nhất xuất hiện ở cả đầu và cuối của chuỗi
	public static String sameEnds(String string){
		//Khai báo 1 biến độ dài của chuỗi tham số truyền vào
		// và 2 chuỗi: chuỗi kết quả và chuỗi con
		int len = string.length();
		String result = "";
		String temp = "";
		for(int i = 0; i < string.length(); i++){
		    temp += string.charAt(i);
		    int tempLen = temp.length();
		    if(i < len/2 && temp.equals(string.substring(len - tempLen))){
		      result = string.substring(0, i+1);
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
			System.out.println("Input of sameEnds: " + strings.get(i));
			System.out.println("Output of sameEnds: " + sameEnds(strings.get(i)));
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
