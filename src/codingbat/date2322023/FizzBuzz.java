package codingbat.date2322023;

import java.util.Scanner;

public class FizzBuzz {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);

	public static String[] fizzBuzz(int start, int end) {
		//Tạo mảng chuỗi có độ dài end-start và biến i
		String result[] = new String[end-start];
		int i = 0;
		while(start < end){
		  //Chuyển số thành chuỗi và gán giá trị vào mảng chuỗi
		  result[i] = Integer.toString(start);
		  if(start % 3 == 0 && start % 5 == 0){
			  //Số chia hết cho 3 và 5 sẽ chuyển thành "FizzBuzz" 
		      result[i] = "FizzBuzz";
		  } else if(start % 3 == 0 && start % 5 != 0){
			  //Số chia hết cho 3 sẽ chuyển thành "Fizz"
			  result[i] = "Fizz";
		  }
		  else if(start % 3 != 0 && start % 5 == 0){
			  //Số chia hết cho 5 sẽ chuyển thành "Buzz"
		      result[i] = "Buzz";
		  }
		    
		  start++;
		  i++;
		}
		
		return result;
		
	}
	
	//Hàm xử lý dữ liệu
	public static void solve() {
		// Khai báo phần tử bắt đầu và kết thúc của mảng
		int start;
		int end;
		
		//lấy dữ liệu từ bàn phím
		//Nhập phần tử bắt đầu và phần tử kết thúc
		System.out.println("Please enter array's start element you want");
		start = sc.nextInt();
		System.out.println("Please enter array's end element you want");
		end = sc.nextInt();
		
		//khai báo độ dài mảng và mảng chuỗi
		int len = end - start;
		String string[] = fizzBuzz(start,end);
							
		// Thực hiện test
		// In ra đầu vào đã nhập
		System.out.print("Input of fizzBuzz: " + start + " " + end);
		System.out.println();
		//In ra đầu ra
		System.out.print("Output of fizzBuzz: ");
		for(int i = 0; i < len; i++) {
			System.out.print(string[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
