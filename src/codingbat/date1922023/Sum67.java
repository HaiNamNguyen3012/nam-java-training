package codingbat.date1922023;

import java.util.Scanner;

public class Sum67 {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	
	//hàm tính tổng các số trong mảng, trừ mảng con bắt đầu bằng 6 và kết thúc bằng 7
	public static int sum67(int[] nums) {
		//khai báo biến stop và sum
		boolean stop = false;
		int sum = 0;
		//tính tổng
		for(int num : nums){
			//nếu num bằng 6 thì stop = true và num bằng 7 thì stop = false
			if(num == 6) stop = true;
			if(num == 7 && stop){
				stop = false;
				continue;
			}
			if(!stop) sum += num;
		}
		return sum;
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
		System.out.print("Input of sum67: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		//In ra đầu ra
		System.out.println("Output of sum67: " + sum67(nums));
	}
			
	//Hàm main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
		// gọi hàm xử lý dữ liệu
		solve();
	}

}
