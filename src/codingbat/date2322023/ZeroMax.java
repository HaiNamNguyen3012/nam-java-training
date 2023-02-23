package codingbat.date2322023;

import java.util.Scanner;

public class ZeroMax {
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	//Method return a version of the given array where each zero value in the array is replaced by
	//the largest odd value to the right of the zero in the array
	public static int[] zeroMax(int[] nums) {
		
		//khai báo biến max
		int max = 0;
		for(int i = nums.length-1; i >=0 ; i--){
		  //Tìm số lẻ lớn nhất bên phải của phần tử có giá trị 0
		  if(nums[i]%2 == 1){
		    max = Math.max(max, nums[i]);
		  }
		  //Gán giá trị bằng 0 bằng giá trị max
		  if(nums[i] == 0) nums[i] = max;
		}
		return nums;
	}

	//Hàm xử lý dữ liệu
	public static void solve() {
		//lấy dữ liệu từ bàn phím
		System.out.println("Please enter array's length you want");
		// Khai báo độ dài mảng, mảng và độ dài mảng con muốn kiểm tra
		int len = sc.nextInt();
		int nums[] = new int[len];
		// Nhập mảng muốn kiểm tra
		System.out.println("Please enter values of all array's elements");
		for(int i = 0; i < len; i++) {
			nums[i] = sc.nextInt();
		}
		
							
		// Thực hiện test
		// In ra đầu vào đã nhập
		System.out.print("Input of zeroMax: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		//Gọi hàm
		nums = zeroMax(nums);
		
		//In ra đầu ra
		System.out.print("Output of zeroMax: ");
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
