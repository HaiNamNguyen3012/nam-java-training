package codingbat.date2222023;

import java.util.Scanner;

public class Post4 {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	//Hàm tạo mảng lấy các phần tử sau phần tử giá trị bằng 4 ở mảng cũ
	public static int[] post4(int[] nums) {
		//khai báo biến i là phần tử cuối của nums
		int i = nums.length - 1;
		//Tìm phần tử có giá trị là 4
		while(nums[i] != 4){
		  i--;
		}
		//Khai báo mảng kết quả
		int result[] = new int[nums.length- i -1];
		
		//Gán cho giá trị cho mảng result
		for(int j = 0; j < result.length; j++){
		  result[j] = nums[j + i + 1];
		}
		return result;
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
		System.out.print("Input of post4: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		//Khai báo 1 mảng kết quả và gọi hàm
		int result[] = post4(nums);
		
		//In ra đầu ra
		System.out.print("Output of post4: ");
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
