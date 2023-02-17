package codingbat.date1222023;

import java.util.ArrayList;
import java.util.Scanner;

public class TeaParty {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int teaParty(int tea, int candy) {
		  if(tea >=5 && candy >= tea * 2 || candy >=5 && tea >= candy * 2) return 2;
		  else if(tea >= 5 && candy >=5) return 1;
		  return 0;
	}
	
	public static void solve() {
		ArrayList<Integer> teas = new ArrayList<Integer>();
		ArrayList<Integer> candys = new ArrayList<Integer>();
		System.out.println("Please enter number of testcases you want");
		int numberOfTestCases = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numberOfTestCases; i++) {
			int tea = sc.nextInt();
			teas.add(tea);
			int candy = sc.nextInt();
			candys.add(candy);
		}
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println("Input of teaParty: " + teas.get(i) + " " + candys.get(i));
			System.out.println("Output of teaParty: " + teaParty(teas.get(i), candys.get(i)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
