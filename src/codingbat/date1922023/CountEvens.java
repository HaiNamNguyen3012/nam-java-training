package codingbat.date1922023;

import java.util.Scanner;

public class CountEvens {
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	//Hàm tính số phần tử chẵn trong mảng
	public static int countEvens(int[] nums) {
		// Khai báo 1 biến đếm trong mảng để đếm số phần tử chẵn
		int count = 0;
		// duyệt tìm phần tử chẵn, phần tử nào chẵn tăng biến count lên 1 đơn vị
		for(int num : nums){
		  if(num%2 == 0) count++;
		}
		//Trả về tổng số chẵn trong mảng
		return count;
	}
	
	// Hàm xử lý dữ liệu
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
		System.out.print("Input of countEvens: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		//In ra đầu ra
		System.out.println("Output of countEvens: " + countEvens(nums));
	}

	//Hàm main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Gọi hàm xử lý dữ liệu
		solve();
	}
	
}
