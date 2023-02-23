package codingbat.date2222023;

import java.util.Scanner;

public class Pre4 {

	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	//Hàm tạo mảng lấy các phần tử trước phần tử giá trị bằng 4 ở mảng cũ
	public static int[] pre4(int[] nums) {
		 //Khai báo biến index để tìm vị trí phần tử 4
		 int index = 0;
		 //Tìm phần tử 4
		 while(nums[index] != 4){
			 index++;
		 }
		 //Khai báo mảng có độ dài bằng index
		 int result[] = new int[index];
		 //Gán giá trị cho mảng result
		 //Các phần tử của Result sẽ có giá trị trước phần tử 4 của mảng cũ
		 for(int j = 0; j < index; j++){
		    result[j] = nums[j];
		 }
		 return result;
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
		System.out.print("Input of pre4: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		//Khai báo 1 mảng kết quả và gọi hàm
		int result[] = pre4(nums);
		
		//In ra đầu ra
		System.out.print("Output of pre4: ");
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

	
	
	//Hàm main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		// gọi hàm xử lý dữ liệu
		solve();
	}
}
