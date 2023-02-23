package codingbat.date1922023;

import java.util.Scanner;

public class Has22 {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	//Hàm kiểm tra có 2 phần tử bằng 2 liên tiếp trong mảng
	public static boolean has22(int[] nums) {
		//Kiểm tra mảng lớn bằng 2
		if(nums.length < 2) return false;
		//kiểm tra có 2 phần tử bằng 2 liên tiếp trong mảng
		for(int i = 0; i < nums.length-1; i++){
			//Nếu trong mảng có phần từng bằng 2 trả về true
			if(nums[i] == 2 && nums[i+1] == 2) return true;
		}
		return false;
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
		System.out.print("Input of has22: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		//In ra đầu ra
		System.out.println("Output of has22: " + has22(nums));
	}
				
	//Hàm main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
						
		// gọi hàm xử lý dữ liệu
		solve();
	}

}
