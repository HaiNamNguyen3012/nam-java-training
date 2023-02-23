package codingbat.date2122023;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Name: withoutString
 * Description: Given two strings, base and remove, return a version of the base string where all
 * instances of the remove string have been removed (not case sensitive).
 * You may assume that the remove string is length 1 or more.
 * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
 */

public class WithoutString {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	public static String withoutString(String base, String remove) {
		  //Khai báo 2 biến độ dài 2 tham số,
		  //2 chuỗi viêt thường của 2 tham số và 1 chuỗi kết quả
		  int blen = base.length();
		  int rlen = remove.length();
		  String lowbase = base.toLowerCase();
		  String lowrem = remove.toLowerCase();
		  String fin = "";
		  
		  //xử lý chuỗi base
		  for (int i = 0; i < blen; i++) {
		    if (i <= blen - rlen) {
		      //Khai báo 1 chuỗi con có độ dài bằng chuỗi cần bỏ
		      String tmp = lowbase.substring(i,i+rlen);
		      //Nếu chuỗi con không bằng chuỗi cần bỏ đi 
		      //Thêm vào chuỗi kết quả
		      if (!tmp.equals(lowrem))
		        fin += base.substring(i,i+1);
		      //Nếu bằng chuỗi cần bỏ thì bỏ qua 
		      else {
		        i += rlen-1;
		      }
		    }
		    else {
		      String tmp2 = lowbase.substring(i,i+1);
		      if (!tmp2.equals(lowrem))
		        fin += base.substring(i,i+1);
		    }
		  }
		  return fin;
	}

	//Hàm xử lý dữ liệu
	public static void solve() {
		// Khai báo 2 String ArrayList để chứa tham số truyền vào của testcase
		ArrayList<String> strings = new ArrayList<String>();
		ArrayList<String> strings2 = new ArrayList<String>();
		//Nhập dữ liệu từ bàn phím
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Please enter the base string you want");
			String string = sc.nextLine();
			strings.add(string);
			System.out.println("Please enter the remove string you want");
			String string2 = sc.nextLine();
			strings2.add(string2);
			
		}
		//In ra input và output
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of withoutString: " + strings.get(i) + " " + strings2.get(i));
			System.out.println("Output of withoutString: " + withoutString(strings.get(i), strings2.get(i)));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}
}
