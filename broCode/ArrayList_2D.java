package broCode;

import java.util.ArrayList;

public class ArrayList_2D {
    public static void main(String[] args){

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> productList = new ArrayList();
        productList.add("tomatoes");
        productList.add("zucchini");
        productList.add("peppers");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("soda");
        drinksList.add("coffee");

        groceryList.add(bakeryList);
        groceryList.add(productList);
        groceryList.add(drinksList);

        System.out.println(groceryList.get(0).get(0));
    }
}
