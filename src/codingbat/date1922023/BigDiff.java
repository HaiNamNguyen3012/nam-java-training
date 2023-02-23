package codingbat.date1922023;

import java.util.Arrays;
import java.util.Scanner;

public class BigDiff {

	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	//Hàm tính hiệu của số lớn nhất và số bé nhất trong mảng
	public static int bigDiff(int[] nums) {
		//sắp xếp mảng theo thứ tự tăng dần
		Arrays.sort(nums);
		//tính hiệu của phần tử cuối và phần tử đầu trong mảng
		return nums[nums.length-1] - nums[0];
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
		System.out.print("Input of bigDiff: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		//In ra đầu ra
		System.out.println("Output of bigDiff: " + bigDiff(nums));
	}
	
	//hàm main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// gọi hàm xử lý dữ liệu
		solve();
	}

}
