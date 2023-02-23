package codingbat.date2222023;

import java.util.Scanner;

public class NotAlone {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	//Method return a version of the given array where every instance
	//of the given value which is alone is replaced by whichever
	//value to its left or right is larger.
	public static int[] notAlone(int[] nums, int val) {
		//Duyệt mảng
		for(int i = 1; i < nums.length - 1; i++){
		  //Tìm phần tử bằng tham số val đã cho
		  // Nếu phần tử bằng tham số val đã cho không bằng hai phần tử cạnh nó
		  if(nums[i] == val && nums[i] !=  nums[i-1] && nums[i] != nums[i+1]){
			 //Nếu phần tử trái lớn hơn phần tử bên phải
			 //gán giá trị phần tử hiện tại bằng phần tử bên trái
			if(nums[i-1] > nums[i+1]) nums[i] = nums[i-1];
			//Nếu phần tử phải lớn hơn phần tử bên trái
			 //gán giá trị phần tử hiện tại bằng phần tử bên trái
		    else if(nums[i-1] < nums[i+1]) nums[i] = nums[i+1];
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
		
		//Khai báo và nhập giá trị muốn kiểm tra
		System.out.println("Please enter values you want to check");
		int value = sc.nextInt();
							
		// Thực hiện test
		// In ra đầu vào đã nhập
		System.out.println("Input of notAlone: ");
		System.out.print("Array: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.print("Value: " + value);
		
		//Gọi hàm
		nums = notAlone(nums, value);
		
		//In ra đầu ra
		System.out.print("Output of notAlone: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
