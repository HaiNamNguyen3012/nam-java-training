import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Test01 {
	public static void main(String args[]) {
		// Declare size of 2 arrays N, max value maxVal
		int N = 50000000;
		int maxVal = 10000;
		
		// Create 2 arrays with random values
		int arr1[] = createArray(N, maxVal);
		//printArray(arr1);
		
		int arr2[] = createArray(N, maxVal);
		//printArray(arr2);
		
		
		// Find list of common elements
		long start = System.currentTimeMillis();
		int[] common = findCommon1(arr1, arr2);
		long stop = System.currentTimeMillis();
		System.out.println("Execution time: " +(stop - start));
		
		start = System.currentTimeMillis();
		int[] common1 = findCommon(arr1, arr2);
		stop = System.currentTimeMillis();
		System.out.println("Execution time: " +(stop - start));
		
		// Print the list
		//printArray(common);
	}

	private static void printArray(int[] common) {
		if(common == null) return;
		for(int c : common) System.out.print(c + ", ");
		System.out.println();
		
	}

	private static int[] findCommon(int[] arr1, int[] arr2) {
		// insert common elements to list
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = 0; i< arr1.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					result.add(arr1[i]);
					break;
				}
			}
		}
		
		// copy elements to array
		int res[] = new int[result.size()];
		for(int i=0; i< res.length; ++i) res[i] = result.get(i);
		return res;
	}
	
	private static int[] findCommon1(int[] arr1, int[] arr2) {
		Set<Integer> set1 = new HashSet<>();
		for(int a: arr1) set1.add(a);
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int a: arr2) if(set1.contains(a)) result.add(a);
		
		// copy elements to array
		int res[] = new int[result.size()];
		for(int i=0; i< res.length; ++i) res[i] = result.get(i);
		return res;
	}

	private static int[] createArray(int n, int maxVal) {
		int[] res = new int[n];
		Random ran = new Random();
		for(int i=0; i<n; ++i) res[i] = Math.abs(ran.nextInt() % (maxVal+1));
		return res;
	}
}
