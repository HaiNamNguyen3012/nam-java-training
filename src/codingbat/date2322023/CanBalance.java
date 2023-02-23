package codingbat.date2322023;

import java.util.Scanner;

public class CanBalance {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);

	//The method return true if there is a place to split the array so that the sum
	// of the numbers on one side is equal to the sum of the numbers on the other side
	public static boolean canBalance(int[] nums) {
		//declare a variable sum1 to calculate total on one side 
		int sum1 = 0;
		for(int i = 0; i < nums.length; i++){
		  sum1 += nums[i];
		  //declare a variable sum2 to calculate total on the other side
		  int sum2 = 0;
		  for(int j = nums.length-1; j > i; j--){
		    sum2 += nums[j];
		  }
		  //Compare two total
		  if(sum1 == sum2) return true;
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
		System.out.print("Input of canBalance: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		//In ra đầu ra
		System.out.print("Output of canBalance: " + canBalance(nums));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
