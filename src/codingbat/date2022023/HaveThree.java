package codingbat.date2022023;

import java.util.Scanner;

public class HaveThree {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	//Hàm trả về true nếu trong mảng có 3 phần tử bằng 3, và những phần tử đó không đứng cạnh nhau
	public static boolean haveThree(int[] nums) {
		// Tạo biến đếm
		int threeCount = 0;
		for(int i = 0; i < nums.length; i++){
		  //Nếu phần tử bằng 3 thì tăng i lên 2 đơn vị
		  // để tránh 2 phần tử cạnh nhau bằng 3
		  if(nums[i] == 3){
		    threeCount++;
		    i++;
		  }
		}
		return (threeCount == 3);
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
		System.out.print("Input of haveThree: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		//In ra đầu ra
		System.out.println("Output of haveThree: " + haveThree(nums));
	}

	//Hàm main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
		// gọi hàm xử lý dữ liệu
		solve();
	}

}
