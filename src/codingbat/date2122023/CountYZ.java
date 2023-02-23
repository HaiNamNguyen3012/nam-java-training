package codingbat.date2122023;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Name: countYZ
 * Description: Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and
 * the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z
 * is at the end of a word if there is not an alphabetic letter immediately following it.
 * (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
 */

public class CountYZ {
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	// Hàm đếm sô từ kết thúc bằng 'y' hoặc 'z'
	public static int countYZ(String str) {
		// Khai báo biến chứa độ dài của chuỗi và biến đếm
		int len = str.length();
		int count = 0;
		
		//Xử lý chuỗi
		str = str.toLowerCase();
		for (int i = 0; i < len; i++) {
		  //Tìm vị trí kí tự 'y' và 'z'
		  if (str.charAt(i) == 'y' || str.charAt(i) == 'z') {
			  
			//Sau kí tự 'y' hoặc 'z' là kí tự đặc biệt hoặc kết thúc chuỗi
			//tăng biến đếm lên 1
		    if (i < len-1 && !Character.isLetter(str.charAt(i+1)))
		      count++;
		    else if (i == len-1)
		      count++;
		  }
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
			System.out.println("Input of countYZ: " + strings.get(i));
			System.out.println("Output of countYZ: " + countYZ(strings.get(i)));
		}
	}
	
	//Hàm main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		solve();
	}

}
