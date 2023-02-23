package codingbat.date2122023;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Name: countTriple
 * Description: We'll say that a "triple" in a string is a char appearing three times in a row.
 * Return the number of triples in the given string.
 * The triples may overlap.
 */
public class CountTriple {
	
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	public static int countTriple(String str) {
		//Khai báo biến độ dài chuỗi tham số đầu vào và biến đếm
		int len = str.length();
		int count = 0;
		
		//Nếu độ dài chuỗi bé hơn 3 trả về 0
		if(len < 3) return 0;
		
		//Xử lý chuỗi
		//Nếu có chuỗi con với độ dài bằng 3 và có 3 ký tự giống nhau tăng biến đếm
		for(int i = 1; i < len - 1; i++){
		  if(str.charAt(i-1) == str.charAt(i) && str.charAt(i) == str.charAt(i+1)) count++;
		}
		return count;
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
			System.out.println("Input of countTriple: " + strings.get(i));
			System.out.println("Output of countTriple: " + countTriple(strings.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
