package broCode;

import java.util.ArrayList;

public class About_ArrayList {
    public static void main(String[] args){
        /*
         * ArrayList = a resizeable array.
         * Elements can be added or removed after complication
         * phase store reference data types.
         */
        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdogs");

        food.set(0, "orange");
        food.remove(2);
        food.clear();

        for(int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }
    }
}
