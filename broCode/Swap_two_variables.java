package broCode;

public class Swap_two_variables {
    public static void main(String[] args) {
		String x = "water";
		String y = "Monster";
		String temp;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}
}
