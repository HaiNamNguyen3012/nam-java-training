package codingbat.date1922023;

import java.util.Scanner;

public class Sum13 {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	//Hàm tính tổng các số trong hàm trừ số 13
	public static int sum13(int[] nums) {
		//Nếu độ dài mảng bằng 0 hoặc độ dài bằng 1 mà giá trị phần tử đó
		// là 13 thì trả về 0
		//khởi tạo biến sum và index của mảng
		int sum = 0;
		int i = 0;
		//chạy vòng lặp để tính tổng
		while( i < nums.length){
			if(nums[i]==13) i+=2;
		    else{
		      sum+=nums[i];
		      i++;
		    }
		}
		return sum;
	}
	//Hàm xử lý dữ liệu
	public static void solve() {
		//lấy dữ liệu từ bàn phím
		System.out.println("Please enter array's length you want");
		// Khai báo độ dài chuỗi và chuỗi
		int len = sc.nextInt();
		int nums[] = new int[len];
		// Nhập chuỗi muốn kiểm tra
		System.out.println("Please enter values of all array's elements");
		for(int i = 0; i < len; i++) {
			nums[i] = sc.nextInt();
		}
				
		// Thực hiện test
		// In ra đầu vào đã nhập
		System.out.print("Input of sum13: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		//In ra đầu ra
		System.out.println("Output of sum13: " + sum13(nums));
	}
		
	//Hàm main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		// gọi hàm xử lý dữ liệu
		solve();
	}

}
