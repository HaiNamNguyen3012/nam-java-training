package codingbat.date2222023;

import java.util.Scanner;

public class ZeroFront {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	//Hàm chuyển những phần tử bằng 0 về đầu mảng	
	public static int[] zeroFront(int[] nums) {
		//Khai báo biến vị trí của những phần tử bằng 0
		int indexZero = 0;
		for(int i = 0; i < nums.length; i++){
		  //Tìm vị trí phần tử bằng 0 và đổi giá trị với những phần tử đầu
		  if(nums[i] == 0){
		    nums[i] = nums[indexZero];
		    nums[indexZero] = 0;
		    indexZero++;
		  }
		}
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
		System.out.print("Input of zeroFront: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		//Gọi hàm
		nums = zeroFront(nums);
		
		//In ra đầu ra
		System.out.print("Output of zeroFront: ");
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
