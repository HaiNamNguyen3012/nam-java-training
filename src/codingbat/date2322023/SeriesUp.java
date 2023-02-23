package codingbat.date2322023;

import java.util.Scanner;

public class SeriesUp {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	public static int[] seriesUp(int n) {
		// Khai báo mảng và index của mảng
		int[] result = new int[n*(n+1)/2];
		int index = 0;
		
		//Gán giá trị cho phần tử của mảng
		for(int i = 1; i <= n; i++){
			for(int j = 1; j < i+1; j++){
				result[index] = j;
				index++;
			}
		}
		return result;
	}
	
	//Hàm xử lý dữ liệu
	public static void solve() {
		// Khai báo biến làm đầu vào của hàm
		int n;
		
		//lấy dữ liệu từ bàn phím
		//Nhập biến
		System.out.println("Please enter number you want");
		n = sc.nextInt();
		
		//khai báo mảng kết quả
		int nums[] = seriesUp(n);
							
		// Thực hiện test
		// In ra đầu vào đã nhập
		System.out.println("Input of fizzArray3: " + n);
		//In ra đầu ra
		System.out.print("Output of fizzArray3: ");
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
