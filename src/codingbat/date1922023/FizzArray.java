package codingbat.date1922023;

import java.util.Scanner;

public class FizzArray {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	//Hàm sinh ra mảng số có độ lớn bằng số đã cho, chứa từ 0 đến n-1
	public static int[] fizzArray(int n) {
		// Khai báo mảng số có phần tử là n
		int result[] = new int[n];
		// Gán giá trị cho phần tử
		for(int i = 0; i < n; i++){
		  result[i] = i;
		}
		return result;
	}
	
	//Hàm xử lý dữ liệu
	public static void solve() {
		//lấy dữ liệu từ bàn phím
		System.out.println("Please enter a number you want");
		// Khởi tạo đầu vào của hàm và mảng kết quả
		int number = sc.nextInt();
		int result[] = fizzArray(number);			
		
		// Thực hiện test
		// In ra đầu vào đã nhập
		System.out.print("Input of more14: " + number);
		System.out.println();
		//In ra đầu ra
		System.out.print("Output of more14: ");
		for(int i = 0; i < number; i++) {
			System.out.print(result[i] + " ");
		}
	}
			
	//Hàm main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
		// gọi hàm xử lý dữ liệu
		solve();
	}
}
