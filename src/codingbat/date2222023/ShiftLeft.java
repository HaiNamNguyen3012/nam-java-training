package codingbat.date2222023;

import java.util.Scanner;

public class ShiftLeft {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	//hàm chuyển phần tử đầu của mảng xuống cuối
	public static int[] shiftLeft(int[] nums) {
		//Xét trường hợp độ dài mảng nhỏ hơn 2
		if(nums.length < 2) return nums;
		//Khai báo biến firstElement và gán bằng phần tử đầu của mảng
		int firstElement = nums[0];
		//Gán phần tử trước bằng phần tử sau
		for(int i = 1; i < nums.length; i++){
		  nums[i-1] = nums[i];
		}
		//Gán phần tử cuối bằng phần tử đầu
		nums[nums.length - 1] = firstElement;
		return nums;
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
		System.out.print("Input of shiftLeft: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		//Gọi hàm
		nums = shiftLeft(nums);
		
		//In ra đầu ra
		System.out.print("Output of shiftLeft: ");
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
