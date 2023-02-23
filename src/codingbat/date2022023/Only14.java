package codingbat.date2022023;

import java.util.Scanner;

public class Only14 {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	//Hàm kiểm tra tất cả phần tử bằng 1 và 4 không
	public static boolean only14(int[] nums) {
		  //Khai báo 2 biến đếm 
		  int oneCount = 0;
		  int fourCount = 0;
		  //Đếm phần tử 1 và 4
		  for(int num : nums){
		    if(num == 1) oneCount++;
		    if(num == 4) fourCount++;
		  }
		  //Trả về đúng số phần từ bằng 1 và 4 bằng độ dài của mảng
		  return (oneCount + fourCount == nums.length);
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
			System.out.print("Input of only14: ");
			for(int i = 0; i < len; i++) {
				System.out.print(nums[i] + " ");
			}
			System.out.println();
			//In ra đầu ra
			System.out.println("Output of only14: " + only14(nums));
	}

	//Hàm main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
		// gọi hàm xử lý dữ liệu
		solve();
	}

}
