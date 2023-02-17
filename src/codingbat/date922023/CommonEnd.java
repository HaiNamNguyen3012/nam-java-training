package codingbat.date922023;

import java.util.Scanner;

public class CommonEnd {

	private static Scanner sc = new Scanner(System.in);
	
	public static boolean commonEnd(int[] a, int[] b) {
		  return (a[0] == b[0] || a[a.length-1] == b[b.length-1]);
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
		
		System.out.println("Input of commonEnd: ");
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
		System.out.println("Output of commonEnd: " + commonEnd(firstNums,secondNums));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
