package codingbat.date2222023;

import java.util.Scanner;

public class TenRun {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	//Method change all the values following it to be that multiple of 10,
	// until encountering another multiple of 10
	public static int[] tenRun(int[] nums) {
		//Khai báo 1 biến để gán giá trị, 1 biến trạng thái
		int temp = 0;
		boolean isTen = false;
		for(int i = 0; i < nums.length; i++){
		  //Nếu 1 phần tử trong mảng chia hết cho 10
		  // thì gán giá trị temp bằng phần tử đó
		  if(nums[i] %10 == 0){
		      temp = nums[i];
		      isTen = true;
		  }
		  //Nếu 1 phần không chia hết cho 10, gán giá trị 
		  // phần tử đó bằng temp
		  if(nums[i] %10 != 0 && isTen){
		      nums[i] = temp;
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
		System.out.print("Input of tenRun: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		//Gọi hàm
		nums = tenRun(nums);
		
		//In ra đầu ra
		System.out.print("Output of tenRun: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
