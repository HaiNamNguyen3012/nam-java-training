package codingbat.date1022023;

import java.util.Scanner;

public class BiggerTwo {

	private static Scanner sc = new Scanner(System.in);
	
	public static int[] biggerTwo(int[] a, int[] b) {
		  int sum1 = a[0] + a[1];
		  int sum2 = b[0] + b[1];
		  if(sum1 >= sum2) return a;
		  return b;
	}
	
	public static void solve() {
		System.out.println("Please enter the first array's length you want");
		int len1 = sc.nextInt();
		int firstNums[] = new int[len1];
		
		System.out.println("Please enter values of all first array's elements");
		for(int i = 0; i < len1; i++) {
			firstNums[i] = sc.nextInt();
		}
				
		System.out.println("Please enter the second array's length you want");
		int len2 = sc.nextInt();
		int secondNums[] = new int[len2];
		
		System.out.println("Please enter values of all second array's elements");
		for(int i = 0; i < len2; i++) {
			secondNums[i] = sc.nextInt();
		}
		
		System.out.println("Input of biggerTwo: ");
		System.out.print("The first array: ");
		for(int i = 0; i < len1; i++) {
			System.out.print(firstNums[i] + " ");
		}
		
		System.out.println();
		System.out.print("The second array: ");
		for(int i = 0; i < len2; i++) {
			System.out.print(secondNums[i] + " ");
		}
		
		System.out.println();
		int[] result = biggerTwo(firstNums, secondNums);
		System.out.print("Output of biggerTwo: ");
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
