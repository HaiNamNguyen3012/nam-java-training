package codingbat.date1322023;

import java.util.ArrayList;
import java.util.Scanner;

public class WithoutDoubles {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
		  if(noDoubles && die1 == 6 && die2 == 6) return 7;
		  else if(noDoubles && die1 == die2) return die1+die2+1;
		  return die1+die2;
	}
	
	public static void solve() {
		ArrayList<Integer> variables1 = new ArrayList<Integer>();
		ArrayList<Integer> variables2 = new ArrayList<Integer>();
		ArrayList<Boolean> variables3 = new ArrayList<Boolean>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			int variable1 = sc.nextInt();
			variables1.add(variable1);
			int variable2 = sc.nextInt();
			variables2.add(variable2);
			boolean variable3 = sc.nextBoolean();
			variables3.add(variable3);
		}
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of withoutDoubles: " + variables1.get(i) + " " + variables2.get(i) + " " + variables3.get(i));
			System.out.println("Output of withoutDoubles: " + withoutDoubles(variables1.get(i), variables2.get(i), variables3.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
