package codingbat.date2022023;

import java.util.Scanner;

public class Has12 {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	//Method true if there is a 1 in the array with a 2 somewhere later in the array
	public static boolean has12(int[] nums) {
		//Khởi tạo 1 biến trạng thái
		boolean found1 = false;
		for(int i = 0; i < nums.length; i++){
		  //Nếu tìm thấy số 1 biến found1 có giá trị true
		  if(nums[i] == 1) found1 = true;
		  //Tìm thấy phần tử bằng 2 sau phần 1 trả về true
		  if(nums[i] == 2 && found1) return true;
		}
		return false;
	}
	
	//Hàm xử lý dữ liệu
	public static void solve() {
		//lấy dữ liệu từ bàn phím
		System.out.println("Please enter array's length you want");
		// Khai báo độ dài mảng và mảng
		int len = sc.nextInt();
		int nums[] = new int[len];
		// Nhập mảng muốn kiểm tra
		System.out.println("Please enter values of all array's elements");
		for(int i = 0; i < len; i++) {
			nums[i] = sc.nextInt();
		}
							
		// Thực hiện test
		// In ra đầu vào đã nhập
		System.out.print("Input of has12: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		//In ra đầu ra
		System.out.println("Output of has12: " + has12(nums));
	}

	//Hàm main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// gọi hàm xử lý dữ liệu
		solve();
	}

}
