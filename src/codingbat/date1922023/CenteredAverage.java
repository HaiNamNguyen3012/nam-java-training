package codingbat.date1922023;

import java.util.Arrays;
import java.util.Scanner;

public class CenteredAverage {
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	//Hàm tính giá trị trung bình cộng của các số trong mảng
	//không bao gồm số bé nhất và số lớn nhất
	public static int centeredAverage(int[] nums) {
		  //Tạo biến để có thể lưu kết quả
		  int result = 0;
		  //Sắp xếp mảng
		  Arrays.sort(nums);
		  //Lấy số bé nhất và lớn nhất trong mảng
		  int min = nums[0];
		  int max = nums[nums.length - 1];
		  //Tính tổng các số trong mảng
		  for(int i = 0; i < nums.length; i++){
		    result += nums[i];
		  }
		  //Tính trung bình cộng không bao gồm số bé nhất và lớn nhất
		  result = (result - min - max)/(nums.length-2);
		  return result;
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
		System.out.print("Input of centeredAverage: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		//In ra đầu ra
		System.out.println("Output of centeredAverage: " + centeredAverage(nums));
	}
	
	//Hàm main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// gọi hàm xử lý dữ liệu
		solve();
	}
}
