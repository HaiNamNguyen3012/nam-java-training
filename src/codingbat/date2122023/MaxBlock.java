package codingbat.date2122023;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxBlock {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	// Hàm độ dài của 1 một chuỗi có nhiều kí tự giống nhau nhất
	public static int maxBlock(String str) {
		  //Trường hợp độ dài chuỗi bằng 0 trả về 0
		  if(str.length() == 0) return 0;
		  
		  //Khai báo 2 biến: biến lấy độ dài dài nhất và biến độ dài hiện tại
		  int maxLen = 0;
		  int currentLen = 1;
		  
		  for(int i = 1; i < str.length(); i++){
			//Nếu hai ký tự liền nhau không giống nhau
		    if(str.charAt(i) != str.charAt(i-1)){
		      //Nếu độ dài chuỗi hiện tại lớn hơn độ dài lớn nhất
		      // gán độ dài chuỗi lớn nhất bằng độ dài hiện tại
		      if(currentLen > maxLen){
		        maxLen = currentLen;
		      } 
		      //đặt độ dài hiện tại về 1
		      currentLen = 1;
		    }else{
		      // Trường hợp hai ký tự liền nhau bằng nhau
		      // Tăng giá trị độ dài hiện tại
		      currentLen++;
		    }
		  }
		  return Math.max(maxLen, currentLen);
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
			System.out.println("Input of maxBlock: " + strings.get(i));
			System.out.println("Output of maxBlock: " + maxBlock(strings.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
