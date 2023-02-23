package codingbat.date2122023;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Name: ghappy
 * Description: We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
 * Return true if all the g's in the given string are happy.
 */

public class GHappy {
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean gHappy(String str) {
		//khai báo 1 biến trạng thái
		boolean happy = false;
		// Trường hợp chuỗi rỗng biến trạng thái có giá trị là true
		if(str.length() == 0) happy = true;
		//Xử lý chuỗi
		for(int i = 0; i < str.length(); i++){
			//Nếu tất cả các chữ 'g' đứng cạnh nhau trả về true
			if(str.charAt(i) == 'g'){
				if(i > 0 && str.charAt(i-1) == 'g') happy = true;
				else if(i < str.length() - 1 && str.charAt(i+1) == 'g') happy = true;
				else happy = false;
			}
		}
		return happy;
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
			System.out.println("Input of gHappy: " + strings.get(i));
			System.out.println("Output of gHappy: " + gHappy(strings.get(i)));
		}
	}
	
	//Hàm main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		solve();
	}

}
