package codingbat.date1022023;

import java.util.Scanner;

public class Start1 {
	private static Scanner sc = new Scanner(System.in);
	
	public static int start1(int[] a, int[] b) {
		   int count = 0;
		  if(a.length > 0 && a[0] == 1)
		    count++;
		  if(b.length > 0 && b[0] == 1)
		    count++;
		  return count;
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
		
		System.out.println("Input of start1: ");
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
		System.out.println("Output of start1: " + start1(firstNums,secondNums));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
