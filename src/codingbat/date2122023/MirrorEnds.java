package codingbat.date2122023;

import java.util.ArrayList;
import java.util.Scanner;

public class MirrorEnds {
	//Khai báo 1 scanner
	private static Scanner sc = new Scanner(System.in);

	//Hàm tìm chuỗi con xuất hiện ở đầu chuỗi và bị đảo ngược ở cuối chuỗi 
	public static String mirrorEnds(String string) {
		//Khai báo chuỗi kết quả
		String result = "";
		//xử lý chuỗi
		for(int i = 0; i < string.length(); i++){
			//So sánh các ký tự từ đầu đến cuối và từ cuối về đầu
			if(string.charAt(i) == string.charAt(string.length() - i - 1)) result += string.charAt(i);
		    //Khi nào hết ký tự giống nhau thì dừng
			else break;
		}
		return result;
	}
	
	//Hàm xử lý dữ liệu
	public static void solve() {
		// Khai báo 1 String ArrayList để chứa tham số truyền vào của testcase
		ArrayList<String> strings = new ArrayList<String>();
		//Nhập dữ liệu từ bàn phím
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			String string = sc.nextLine();
			strings.add(string);
		}
		//In ra input và output
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of mirrorEnds: " + strings.get(i));
			System.out.println("Output of mirrorEnds: " + mirrorEnds(strings.get(i)));
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
