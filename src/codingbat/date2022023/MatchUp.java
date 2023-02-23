package codingbat.date2022023;

import java.util.Scanner;

public class MatchUp {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	// The method return the count of the number of times that the two elements differ by 2 or less,
	//but are not equal
	public static int matchUp(int[] nums1, int[] nums2) {
		//Tạo biến đếm
		int count = 0;
		for(int i = 0; i < nums1.length; i++){
		  //Biến x là hiệu của hai phần tử cùng vị trí của 2 mảng 
		  int x = Math.abs(nums1[i] - nums2[i]);
		  if( 0 < x && x <= 2) count++;
		}
		return count;
	}
	
	//Hàm xử lý dữ liệu
	public static void solve() {
		//lấy dữ liệu từ bàn phím
		System.out.println("Please enter array's length you want");
		// Khai báo độ dài chuỗi và chuỗi
		int len = sc.nextInt();
		int nums1[] = new int[len];
		int nums2[] = new int[len];
		// Nhập hai mảng muốn kiểm tra
		System.out.println("Please enter values of the first array's elements");
		for(int i = 0; i < len; i++) {
			nums1[i] = sc.nextInt();
		}
		
		System.out.println("Please enter values of the second array's elements");
		for(int i = 0; i < len; i++) {
			nums2[i] = sc.nextInt();
		}
						
		// Thực hiện test
		// In ra đầu vào đã nhập
		System.out.println("Input of matchUp: ");
		System.out.print("The first array: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums1[i] + " ");
		}
		System.out.println();
		System.out.print("The second array: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums2[i] + " ");
		}
		System.out.println();
		//In ra đầu ra
		System.out.println("Output of matchUp: " + matchUp(nums1, nums2));
	}
	
	//Hàm main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// gọi hàm xử lý dữ liệu
		solve();
	}

}
