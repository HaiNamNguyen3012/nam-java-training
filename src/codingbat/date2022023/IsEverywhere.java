package codingbat.date2022023;

import java.util.Scanner;

public class IsEverywhere {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	//Hàm kiểm tra từng cặp của mảng có giá trị cho sẵn không
	public static boolean isEverywhere(int[] nums, int val) {
		
		  //Khai báo biến đếm
		  int everywhereCount = 0;
		  
		  //Xét trường hợp độ dài của mảng bằng 0
		  if(nums.length == 0) return true;
		  for(int i = 0; i < nums.length - 1; i++){
		    if(nums[i] == val && nums[i + 1] == val||  nums[i] == val && nums[i + 1] != val ||  nums[i] !=  val && nums[i + 1] == val) everywhereCount++;
		  }
		  //Nếu biến đếm bé hơn độ dài của mảng 1 đơn vị thì trả về đúng
		  return (everywhereCount == nums.length-1);
	}
	
	//Hàm xử lý dữ liệu
	public static void solve() {
		//lấy dữ liệu từ bàn phím
		System.out.println("Please enter array's length you want");
		// Khai báo độ dài chuỗi và chuỗi
		int len = sc.nextInt();
		int nums[] = new int[len];
		// Nhập mảng muốn kiểm tra
		System.out.println("Please enter values of all array's elements");
		for(int i = 0; i < len; i++) {
			nums[i] = sc.nextInt();
		}
		//Khai báo và nhập một số để tìm cặp trong mảng
		System.out.println("Please enter a number you want");
		int number = sc.nextInt();
				
		// Thực hiện test
		// In ra đầu vào đã nhập
		System.out.print("Input array of isEverywhere: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.println("Input number of isEverywhere: " + number);
		System.out.println();
		
		//In ra đầu ra
		System.out.println("Output of isEverywhere: " + isEverywhere(nums, number));
	}

	//Hàm main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// gọi hàm xử lý dữ liệu
		solve();
	}

}
