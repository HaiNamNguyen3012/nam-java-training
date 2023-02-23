package codingbat.date1922023;

import java.util.Scanner;

public class Sum28 {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	//hàm kiểm tra tổng các số 2 trong mảng có bằng 8 hay không
	public static boolean sum28(int[] nums) {
		// khai báo biến đếm có bao nhiêu số 2 trong mảng
		int twoCount = 0;
		for(int num : nums){
			if(num == 2) twoCount++;
		}
		//Trả về đúng nếu có 4 số 2 trong mảng
		return (twoCount == 4);
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
		System.out.print("Input of sum28: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		//In ra đầu ra
		System.out.println("Output of sum28: " + sum28(nums));
	}
				
	//Hàm main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
						
		// gọi hàm xử lý dữ liệu
		solve();
	}

}
