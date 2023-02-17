package brocode;

import java.util.ArrayList;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> animals = new ArrayList<String>();
        
        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");
        
        for(String i : animals){
            System.out.println(i);
        }
	}

}
