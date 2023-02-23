package codingbat.date2322023;

import java.util.Scanner;

public class LinearIn {
	
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);
	
	//Hàm kiểm tra phần tử mảng inner có trong mảng outer không
	public static boolean linearIn(int[] outer, int[] inner) {
		//Khai báo biến đếm và biến j là index của inner 
		int count = 0;
		int j = 0;
		
		//Trường hợp mảng inner không có phần tử trả về true
		if(inner.length == 0) return true;
		
		//Duyệt mảng
		for(int i = 0; i < outer.length; i++){
		  //Nếu phần tử 2 mảng bằng nhau thì tăng biến đếm và index của mảng inner
		  if(outer[i] == inner[j]){
		    count++;
		    j++;
		  } 
		  //2 mảng đã sắp xếp
		  //Nếu duyệt đến phần tử outer lớn hơn phần tử của inner sẽ trả về false
		  else if(outer[i] > inner[j]){
		    return false;
		  }
		   //Nếu count bằng độ dài của inner sẽ trả về true 
		   if(count == inner.length) return true;
		}
		  return false;
	}
	
	//Hàm xử lý dữ liệu
	public static void solve() {
		//lấy dữ liệu từ bàn phím
		System.out.println("Please enter outer array's length you want");
		// Khai báo độ dài mảng, mảng outer
		int len = sc.nextInt();
		int outer[] = new int[len];
		// Nhập mảng outer
		System.out.println("Please enter values of all outer array's elements");
		for(int i = 0; i < len; i++) {
			outer[i] = sc.nextInt();
		}
		
		// Khai báo độ dài mảng, mảng inner
		System.out.println("Please enter inner array's length you want");
		int len2 = sc.nextInt();
		int inner[] = new int[len];
		// Nhập mảng inner
		System.out.println("Please enter values of all inner array's elements");
		for(int i = 0; i < len2; i++) {
			inner[i] = sc.nextInt();
		}
		
							
		// Thực hiện test
		// In ra đầu vào đã nhập
		System.out.println("Input of canBalance: ");
		System.out.print("Outer Array: ");
		for(int i = 0; i < len; i++) {
			System.out.print(outer[i] + " ");
		}
		System.out.println();
		System.out.print("Inner Array: ");
		for(int i = 0; i < len2; i++) {
			System.out.print(inner[i] + " ");
		}
		System.out.println();
		//In ra đầu ra
		System.out.print("Output of canBalance: " + linearIn(outer, inner));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
