package codingbat.date2222023;

import java.util.Scanner;

public class SameEnds {
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	//hàm kiểm tra các phần tử đầu mảng và cuối mảng có bằng nhau
	public static boolean sameEnds(int[] nums, int len) {
		//khai báo 2 mảng con với số phần tử là tham số len truyền vào
		int start[] = new int[len];
		int end[] = new int[len];
		//khai báo biến y bằng tham số len;
		int y = len;
		//gán phần tử cho mảng start và mảng end
		for(int i = 0; i < len; i++){
		    start[i] = nums[i];
		    if(y > 0){
		       end[i] = nums[nums.length - y];
		       y--;
		    }
		}
		  
		//so sánh các phần tử start và end
		for(int i = 0; i < len ; i++){
		    if(start[i] != end[i]) return false;
		}
		return true;
	}
	//Hàm xử lý dữ liệu
	public static void solve() {
		//lấy dữ liệu từ bàn phím
		System.out.println("Please enter array's length you want");
		// Khai báo độ dài mảng, mảng và độ dài mảng con muốn kiểm tra
		int len = sc.nextInt();
		int nums[] = new int[len];
		int subLen;
		// Nhập mảng muốn kiểm tra
		System.out.println("Please enter values of all array's elements");
		for(int i = 0; i < len; i++) {
			nums[i] = sc.nextInt();
		}
		//Nhập độ dài mảng con muốn kiểm tra
		System.out.println("Please enter array's length you want");
		subLen = sc.nextInt();
							
		// Thực hiện test
		// In ra đầu vào đã nhập
		System.out.print("Array of sameEnds: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.println("Length of sub array of sameEnd: " + subLen);
		
		//In ra đầu ra
		System.out.println("Output of sameEnds: " + sameEnds(nums,subLen));
	}

	//Hàm main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// gọi hàm xử lý dữ liệu
		solve();
	}
}