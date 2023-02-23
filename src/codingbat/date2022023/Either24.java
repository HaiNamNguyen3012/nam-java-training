package codingbat.date2022023;

import java.util.Scanner;

public class Either24 {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);

	
	//Hàm kiểm tra có cặp 4 hoặc cặp số 2 ở trong mảng không
	// nhưng hai cặp không được xuất hiện cùng nhau.
	public static boolean either24(int[] nums) {
		
		  //Khai báo 2 biến đếm
		  int double2Count = 0;
		  int double4Count = 0;
		  //Đếm cặp 2 hoặc cặp 4
		  for(int i = 0; i < nums.length - 1; i++){
		    if(nums[i] == 2 && nums[i+1] == 2) double2Count++;
		    if(nums[i] == 4 && nums[i+1] == 4) double4Count++;
		  }
		  
		  return (double2Count == 0 && double4Count != 0 || double2Count != 0 && double4Count == 0);
	}
	
	//Hàm xử lý dữ liệu
	public static void solve() {
		//lấy dữ liệu từ bàn phím
		System.out.println("Please enter array's length you want");
		// Khai báo độ dài chuỗi và chuỗi
		int len = sc.nextInt();
		int nums[] = new int[len];
		// Nhập mảng muốn kiểm tra
		System.out.println("Please enter values of all array's elements");
		for(int i = 0; i < len; i++) {
			nums[i] = sc.nextInt();
		}
						
		// Thực hiện test
		// In ra đầu vào đã nhập
		System.out.print("Input of either24: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		//In ra đầu ra
		System.out.println("Output of either24: " + either24(nums));
	}

	//Hàm main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
						
		// gọi hàm xử lý dữ liệu
		solve();
	}
	
}
