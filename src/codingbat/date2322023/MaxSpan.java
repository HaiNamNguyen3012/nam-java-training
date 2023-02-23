package codingbat.date2322023;

import java.util.Scanner;

public class MaxSpan {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	//Hàm trả về khoảng cách lớn giữa hai phần tử giống nhau trong mảng
	public static int maxSpan(int[] nums) {
		// Khai báo biến max
		int max = 0;
		for(int i = 0; i < nums.length; i++){
		  //Khai báo biến j là phần index cuối của mảng
		  int j = nums.length-1;
		  //Tìm hai phần tử giống nhau
		  //i chạy từ đầu mảng và j chạy từ cuối mảng
		  while(nums[i] != nums[j])
		    j--;
		  //Khai báo biến span là khoảng cách giữa hai phần tử giống nhau  
		  int span = j-i+1;
		  //Nếu span lớn hơn max thì gán max bằng span
		  if(span > max)
		    max = span;
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
		System.out.print("Input of maxSpan: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		//In ra đầu ra
		System.out.print("Output of maxSpan: " + maxSpan(nums));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
