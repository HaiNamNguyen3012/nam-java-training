package codingbat.date2022023;

import java.util.Scanner;

public class FizzArray2 {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	//Hàm sinh ra mảng String có độ lớn bằng số đã cho, chứa từ 0 đến n-1
	public static String[] fizzArray2(int n) {
		  // Khai báo mảng String có phần tử là n
		  String result[] = new String[n];
		  
		  // Gán giá trị cho phần tử
		  for(int i = 0; i < n; i++){
		    result[i] = Integer.toString(i);
		  }
		  return result;
	}
	
	//Hàm xử lý dữ liệu
	public static void solve() {
			//lấy dữ liệu từ bàn phím
			System.out.println("Please enter a number you want");
			// Khởi tạo đầu vào của hàm và mảng kết quả
			int number = sc.nextInt();
			String result[] = fizzArray2(number);		
			
			// Thực hiện test
			// In ra đầu vào đã nhập
			System.out.print("Input of more14: " + number);
			System.out.println();
			//In ra đầu ra
			System.out.print("Output of more14: ");
			for(int i = 0; i < number; i++) {
				System.out.print( result[i] + " ");
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
