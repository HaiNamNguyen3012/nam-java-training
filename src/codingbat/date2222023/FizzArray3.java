package codingbat.date2222023;

import java.util.Scanner;

public class FizzArray3 {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	//hàm tạo mảng có phần tử bắt đầu bằng tham số start
	// và kết thúc bằng giá trị end-1
	public static int[] fizzArray3(int start, int end) {
		  // Khai báo mảng với độ dài end-start
		  int result[] = new int[end-start];
		  // Gán phần tử cho mảng
		  for(int i = 0; i < end-start; i++){
		    result[i] = start + i;
		  }
		  return result;
	}
	
	//Hàm xử lý dữ liệu
	public static void solve() {
		// Khai báo biến bắt đầu và kết thúc của mảng
		int start;
		int end;
		
		//lấy dữ liệu từ bàn phím
		//Nhập phần tử bắt đầu và phần tử kết thúc
		System.out.println("Please enter array's start element you want");
		start = sc.nextInt();
		System.out.println("Please enter array's end element you want");
		end = sc.nextInt();
		
		//khai báo độ dài mảng và mảng
		int len = end - start;
		int nums[] = fizzArray3(start,end);
							
		// Thực hiện test
		// In ra đầu vào đã nhập
		System.out.print("Input of fizzArray3: " + start + " " + end);
		//In ra đầu ra
		System.out.print("Output of fizzArray3: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	//Hàm main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// gọi hàm xử lý dữ liệu
		solve();
	}


}
