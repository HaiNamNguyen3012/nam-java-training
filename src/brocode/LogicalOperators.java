package brocode;
import java.util.Scanner;
public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // && operator
        // int temp = 15;

        // if(temp > 30){
        //     System.out.println("It is hot outside");
        // } else if(temp >= 20 && temp <= 30){
        //     System.out.println("It is warm outside");
        // } else{
        //     System.out.println("It is cold outside");
        // }

        // || operator
        Scanner sc = new Scanner(System.in);
        
        System.out.println("You are playing a game! Press q or Q to quit");
        String response = sc.next();
        if(response.equals('q') || response.equals('Q')){
            System.out.println("You quit the game!");
        } else{
            System.out.println("You are still playing the game!");
        }
        sc.close();
	}

}
