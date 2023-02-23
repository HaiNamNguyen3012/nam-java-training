package codingbat.date2022023;

import java.util.Scanner;

public class Has77 {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	
	//Method return true if the array contains two 7's next to each other,
	//or there are two 7's separated by one element
	public static boolean has77(int[] nums) {
		//Tạo biến trạng thái
		boolean has77 = false;
		for(int i = 0; i < nums.length-1; i++){
		  //so sánh hai phần tử cạnh nhau = 7
		  if(nums[i] == 7 && nums[i+1] == 7)
		    has77 = true;
		  //so sánh hai phần tử 7 cách nhau 1 phần tử
		  if(i <= nums.length - 3 && nums[i] == 7 && nums[i+2] == 7)
		    has77 = true;
		}
		  return has77;
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
		System.out.print("Input of has77: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		//In ra đầu ra
		System.out.println("Output of has77: " + has77(nums));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
