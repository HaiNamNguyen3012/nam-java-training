package codingbat.date2122023;

import java.util.Scanner;

public class TwoTwo {
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	//Hàm trả về đúng nếu không có số 2 đứng 1 mình
	public static boolean twoTwo(int[] nums) {
		  //Trường hợp mảng có 1 phần tử và phần tử đó giá trị bằng 2
		  if(nums.length == 1 && nums[0] == 2) return false;
		  
		  //Trường hợp số 2 đứng đầu và phần tử tiếp theo không phải 2
		  //Trường hợp số 2 đứng cuối và phần tử trước đó không phải 2
		  if(nums.length >= 2 && ((nums[0] == 2 && nums[1] != 2) || (nums[nums.length-1] == 2 && nums[nums.length-2] != 2)))
		        return false;
		  
		  //Duyệt mảng
		  for(int i = nums.length -2; i > 0 ; i--){
			//Nếu có số 2 đứng một mình, trả về false
		    if(nums[i+1]!=2 && nums[i] == 2 && nums[i - 1] != 2){
		      return false;
		    }
		  }
		  return true;
	}

	//Hàm xử lý dữ liệu
	public static void solve() {
		//lấy dữ liệu từ bàn phím
		System.out.println("Please enter array's length you want");
		// Khai báo độ dài mảng và mảng
		int len = sc.nextInt();
		int nums[] = new int[len];
		// Nhập mảng muốn kiểm tra
		System.out.println("Please enter values of all array's elements");
		for(int i = 0; i < len; i++) {
			nums[i] = sc.nextInt();
		}
							
		// Thực hiện test
		// In ra đầu vào đã nhập và đầu ra
		System.out.print("Input of twoTwo: ");
		for(int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.println("Output of twoTwo: " + twoTwo(nums));
	}

	//Hàm main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// gọi hàm xử lý dữ liệu
		solve();
	}
}
