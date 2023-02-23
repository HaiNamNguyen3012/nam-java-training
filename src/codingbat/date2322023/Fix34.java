package codingbat.date2322023;

import java.util.Scanner;

public class Fix34 {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	//Hàm đưa nhưng phần tử 4 ra ngay sau phần tử 3
	public static int[] fix34(int[] nums) {
		  //Khai báo biến i để tìm phần tử 3
		  int i = 0;
		  while(i < nums.length && nums[i] != 3){
		    i++;
		  }
		  //Khai báo biến i để tìm phần tử 4
		  int j = i + 1;
		  while(j < nums.length && nums[j] != 4){
		    j++;
		  }
		  
		  //Duyệt mảng và đưa phần tử 4 ra ngay sau phần tử 3
		  while(i < nums.length) {
		    if(nums[i] == 3) {
		      int temp = nums[i+1];
		      nums[i+1] = nums[j];
		      nums[j] = temp;
		                                                          
		      while(j < nums.length && nums[j] != 4)
		        j++;
		    }
		    i++;
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
		
		//Khai báo mảng kết quả;
		int result[] = fix34(nums);
		
		
		// Thực hiện test
		// In ra đầu vào đã nhập
		System.out.print("Input of fix34: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		//In ra đầu ra
		System.out.print("Output of fix34: ");
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
