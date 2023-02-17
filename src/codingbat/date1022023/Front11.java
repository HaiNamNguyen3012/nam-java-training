package codingbat.date1022023;

import java.util.Scanner;

public class Front11 {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int[] front11(int[] a, int[] b) {
		  if (a.length == 0 && b.length == 0) return new int[] {};
		  else if (a.length !=0 && b.length == 0) return new int[]{a[0]};
		  else if (a.length == 0 && b.length != 0) return new int[]{b[0]};
		  else return new int[] {a[0],b[0]};
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
		
		System.out.println("Input of front11: ");
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
		int[] result = front11(firstNums, secondNums);
		System.out.print("Output of front11: ");
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
