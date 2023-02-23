package codingbat.date2022023;

import java.util.Scanner;

public class No14 {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
		
	//Hàm trả về đúng nếu không có 1 hoặc hoặc không có 4
	public static boolean no14(int[] nums) {
		//Khai báo 2 biến đếm
		int oneCount = 0;
		int fourCount = 0;
		//Đếm các phần từ bằng 1 và bằng 4
		for(int num : nums){
		  if(num == 1) oneCount++;
		  if(num == 4) fourCount++;
		}
		return (oneCount == 0 && fourCount!=0 || oneCount != 0 && fourCount==0 || oneCount == 0 && fourCount==0);
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
		// In ra đầu vào đã nhập và đầu ra
		System.out.print("Input of no14: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.println("Output of no14: " + no14(nums));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
