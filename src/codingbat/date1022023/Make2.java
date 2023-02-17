package codingbat.date1022023;

import java.util.Scanner;

public class Make2 {

	private static Scanner sc = new Scanner(System.in);
	
	public static int[] make2(int[] a, int[] b) {
		  if(a.length >= 2) return new int[] {a[0], a[1]};
		  else if(a.length == 1) return new int[] {a[0], b[0]};
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
		
		System.out.println("Input of make2: ");
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
		int[] result = make2(firstNums, secondNums);
		System.out.print("Output of make2: ");
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
