package codingbat.date1322023;

import java.util.ArrayList;
import java.util.Scanner;

public class BlueTicket {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int blueTicket(int a, int b, int c) {
		  int sum1 = a+b;
		  int sum2 = b+c;
		  int sum3 = c+a;
		  if(sum1 == 10 || sum2 == 10 || sum3 == 10) return 10;
		  if(sum1-10 == sum2 || sum1-10 == sum3 || sum2-10 == sum1 || sum2-10 == sum3 || sum3-10 == sum1 || sum3-10 == sum2) return 5;
		  return 0;
	}
	
	public static void solve() {
		ArrayList<Integer> aNums = new ArrayList<Integer>();
		ArrayList<Integer> bNums = new ArrayList<Integer>();
		ArrayList<Integer> cNums = new ArrayList<Integer>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			int aNum = sc.nextInt();
			aNums.add(aNum);
			int bNum = sc.nextInt();
			bNums.add(bNum);
			int cNum = sc.nextInt();
			cNums.add(cNum);
		}
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of blueTicket: " + aNums.get(i) + " " + bNums.get(i) + " " + cNums.get(i));
			System.out.println("Output of blueTicket: " + blueTicket(aNums.get(i), bNums.get(i), cNums.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
