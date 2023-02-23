package codingbat.date1922023;

import java.util.Scanner;

public class Lucky13 {
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	//Hàm kiểm tra có số 1 hoặc 3 trong mảng không
	public static boolean lucky13(int[] nums) {
		//khai báo 2 biến đếm 
		int oneCount = 0;
		int threeCount = 0;
		//Lặp qua mảng để đếm
		for(int num : nums){
		  if(num == 1) oneCount++;
		  else if(num == 3) threeCount++;
		}
		//Nếu có 1 hoặc 3 hoặc cả 2 trong mảng trả về false
		if(oneCount > 0 || threeCount > 0){
		  return false;
		}
		return true;
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
		System.out.print("Input of lucky13: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		//In ra đầu ra
		System.out.println("Output of sum13: " + lucky13(nums));
	}
			
	//Hàm main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
		// gọi hàm xử lý dữ liệu
		solve();
	}

}
