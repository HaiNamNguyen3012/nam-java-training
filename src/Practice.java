import java.util.ArrayList;
import java.util.Scanner;

public class Practice {
	
	/*
	 * Yeu cau: cho cac phan tu random cua array. Tim cac phan tu giong nhau cua 2 array
	 */
	
	
	
	private static Scanner sc = new Scanner(System.in);
	
	/*
	 * Ham tim 2 phan tu giong nhau cua 2 array \
	 * B1: Khai bao 1 ArrayList result de them cac phan tu giong nhau cua 2 array
	 * B2 cho duyet 1 vong for long nhau de tim ra cac phan tu giong nhau
	 * B3 So sanh cac phan tu cua 2 array
	 * B4 Neu 2 phan tu giong nhau thi add vao result
	 */
	public static ArrayList<Integer> searchTwoElement(int[] arr1, int[] arr2) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = 0; i< arr1.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					result.add(arr1[i]);
				}
			}
		}
		
		return result;
	}
	
	/*
	 * B1 Khai bao cac array 
	 * B2 them cac phan tu vao array
	 * B3 Them Array List result
	 * B4 goi ham searchTwoElement
	 * B5 IN ra input
	 * B6 In ra output
	 */
	
	public static void solve() {
		System.out.println("Please enter the arr length:");
		int len = sc.nextInt();
		//Khai bao 2 array
		int arr1[] = new int[len];
		int arr2[] = new int[len];
		
		//Them input vao arr1
		for(int i = 0; i < len; i++) {
			 int rand = (int) Math.random() +1;
			 arr1[i] = rand;
		}
		//Them input vao arr1
		for(int i = 0; i < len; i++) {
			int rand = (int) Math.random()*6 +1;
			arr2[i] = rand;
		}
		
		//khai bao result
		ArrayList<Integer> result = searchTwoElement(arr1, arr2);
		
		System.out.println("Input: ");
		
		
		for(int i = 0; i < len; i++) {
			 int rand = (int) Math.random();
			 arr1[i] = rand;
		}
		System.out.println("The first array: ");
		for(int i = 0; i < len; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println("The second array: ");
		for(int i = 0; i < len; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("output: ");
		
		for(int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i) + " ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
