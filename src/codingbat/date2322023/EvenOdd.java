package codingbat.date2322023;

import java.util.Scanner;

public class EvenOdd {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	//Hàm chuyển những phần tử chẵn lên nửa đầu mảng
	public static int[] evenOdd(int[] nums) {
		//Khai báo biến để chuyển những phần tử chẵn lên đầu 
		int indexEven = 0;
		
		for(int i = 0; i < nums.length; i++){
		  //Nếu phần tử đó chẵn, đổi giá trị đó lên đầu
		  if(nums[i] %2 == 0){
		    int temp = nums[i];
		    nums[i] = nums[indexEven];
		    nums[indexEven] = temp;
		    indexEven++;
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
		System.out.print("Input of evenOdd: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		//Gọi hàm
		nums = evenOdd(nums);
		
		//In ra đầu ra
		System.out.print("Output of evenOdd: ");
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
