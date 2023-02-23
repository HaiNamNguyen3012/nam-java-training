package codingbat.date2022023;

import java.util.Scanner;

public class ModThree {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	// Hàm trả về true nếu mảng có 3 phần tử chẵn hoặc 3 phần tử lẻ đứng cạnh nhau
	public static boolean modThree(int[] nums) {
		  for(int i = 0; i < nums.length - 2; i++){
			// Nếu mảng có 3 phần tử chẵn hoặc 3 phần tử lẻ đứng cạnh nhau thì trả về true
		    if(nums[i]%2==0 && nums[i+1]%2==0 && nums[i+2]%2==0 || nums[i]%2==1 && nums[i+1]%2==1 && nums[i+2]%2==1) return true;
		  }
		  return false;
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
		System.out.print("Input of modThree: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		//In ra đầu ra
		System.out.println("Output of modThree: " + modThree(nums));
	}

	//Hàm main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		// gọi hàm xử lý dữ liệu
		solve();
	}

}
