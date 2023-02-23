package codingbat.date2122023;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Name: equalIsNot
 * Description: Given a string, return true if the number of appearances of "is" anywhere in the string is
 * equal to the number of appearances of "not" anywhere in the string (case sensitive).
 */

public class EqualIsNot {
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	//Hàm kiểm tra số từ 'is' có bằng 'not' không
	public static boolean equalIsNot(String str) {
		//Khai báo 2 biến đếm
		int isCount = 0;
		int notCount = 0;
		
		//Xử lý chuỗi
		for(int i = 0; i < str.length()-2; i++){
			//Kiểm tra từ 0 đến str.length()-3 có bao nhiêu từ 'is'
			if(str.substring(i, i+2).equals("is")){
				isCount++;
			} 
			//Kiểm tra từ 0 đến str.length()-3 có bao nhiêu từ 'not'
			else if(str.substring(i, i+3).equals("not")){
				notCount++;
			}
		}
		//Kiểm tra 2 kí tự cuối của chuỗi có bằng 'is'
		if(str.length() >= 2 && str.substring(str.length() - 2).equals("is"))
		  isCount++;
		return (isCount == notCount);
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
			System.out.println("Input of equalIsNot: " + strings.get(i));
			System.out.println("Output of equalIsNot: " + equalIsNot(strings.get(i)));
		}
	}
		
	//Hàm main
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		solve();
	}

}
