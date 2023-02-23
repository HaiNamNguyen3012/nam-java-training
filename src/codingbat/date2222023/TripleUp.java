package codingbat.date2222023;

import java.util.Scanner;

public class TripleUp {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	//hàm kiểm tra mảng có mảng con có 3 phần tử tăng dần đều
	public static boolean tripleUp(int[] nums) {
		//Duyệt mảng
		for(int i = 1; i < nums.length-1; i++){
		  //So sánh 3 phần tử liên tiếp có tăng dần đều không?
		  if(nums[i] == nums[i-1] + 1 && nums[i] + 1 == nums[i+1]) return true;
		}
		return false;
	}
	//Hàm xử lý dữ liệu
	public static void solve() {
		//lấy dữ liệu từ bàn phím
		System.out.println("Please enter array's length you want");
		// Khai báo độ dài mảng, mảng muốn kiểm tra
		int len = sc.nextInt();
		int nums[] = new int[len];
		// Nhập mảng muốn kiểm tra
		System.out.println("Please enter values of all array's elements");
		for(int i = 0; i < len; i++) {
			nums[i] = sc.nextInt();
		}
							
		// Thực hiện test
		// In ra đầu vào đã nhập
		System.out.print("Input of tripleUp: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		//In ra đầu ra
		System.out.println("Output of tripleUp: " + tripleUp(nums));
	}

	//Hàm main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// gọi hàm xử lý dữ liệu
		solve();
	}

}
