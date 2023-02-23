package codingbat.date2222023;

import java.util.Scanner;

public class WithoutTen {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	//Hàm bỏ những giá trị bằng 10 và sắp xếp xuống cuối mảng
	public static int[] withoutTen(int[] nums) {
		
		int i = 0;
		//Tìm vị trí của phần tử bằng 10
		while(i < nums.length && nums[i] != 10)
			i++;
		    
		//Duyệt mảng
		for(int j = i + 1; j < nums.length; j++) {
			//chuyển những phần tử giá trị bằng 10 xuống nửa sau của mảng
			if(nums[j] != 10) {
				nums[i] = nums[j];
				nums[j] = 10;
				i++;
			}
		}
		  
		//Gán những phần tử 10 có giá trị 0
		for( ; i < nums.length; i++)
		  nums[i] = 0;
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
		System.out.print("Input of withoutTen: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		//Gọi hàm
		nums = withoutTen(nums);
		
		//In ra đầu ra
		System.out.print("Output of withoutTen: ");
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
