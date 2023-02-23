package codingbat.date2322023;

import java.util.Scanner;

public class MaxMirror {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	//Hàm tìm độ dài lớn nhất của mảng con là đảo ngược của mảng con khác trong chuỗi 
	public static int maxMirror(int[] nums) {
		//Khai báo biến lưu độ dài mảng con lớn nhất
		int max = 0;
		//Duyệt mảng
		//1 vòng for chạy từ đầu đến cuối mảng
		//1 vòng for chạy từ cuối đến đầu mảng
		for(int start = 0; start < nums.length; start++) {
		  for(int begin = nums.length - 1; begin >= 0; begin--) {
			//Khai báo biến độ dài mảng con, i là index phần tử đầu mảng
			// j là index phần tử cuối mảng
		    int size = 0;
		    int i = start;
		    int j = begin;
		    //tìm độ dài lớn nhất của mảng con là đảo ngược của mảng con khác trong chuỗi
		    while(i < nums.length && j >= 0 && nums[i] == nums[j]) {
		      size++;
		      i++;
		      j--;
		    }
		    max = Math.max(max, size);
		  }
		}
		return max;
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
		System.out.print("Input of maxMirror: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		//In ra đầu ra
		System.out.print("Output of maxMirror: " + maxMirror(nums));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
