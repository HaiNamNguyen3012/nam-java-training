package codingbat.date1922023;

import java.util.Scanner;

public class More14 {
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	//Hàm kiểm tra số lượng phần tử bằng 1 có lớn hơn phần từ bằng 4 không
	public static boolean more14(int[] nums) {
		//Khai báo 2 biến đếm 
		int oneCount = 0;
		int fourCount = 0;
		//Đếm số lượng bằng 1 và 4
		for(int num : nums){
		  if(num == 1) oneCount++;
		  if(num == 4) fourCount++;
		}
		//Trả về đúng nếu số phần tử 1 lớn hơn 4
		return (oneCount > fourCount);
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
		System.out.print("Input of more14: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		//In ra đầu ra
		System.out.println("Output of more14: " + more14(nums));
	}
		
	//Hàm main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		// gọi hàm xử lý dữ liệu
		solve();
	}
}
