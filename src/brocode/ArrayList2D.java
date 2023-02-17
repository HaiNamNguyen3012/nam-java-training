package brocode;

import java.util.ArrayList;

public class ArrayList2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();

        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> productList = new ArrayList<String>();
        productList.add("tomatoes");
        productList.add("zucchini");
        productList.add("peppers");

        ArrayList<String> drinksList = new ArrayList<String>();
        drinksList.add("soda");
        drinksList.add("coffee");

        groceryList.add(bakeryList);
        groceryList.add(productList);
        groceryList.add(drinksList);

        System.out.println(groceryList.get(0).get(0));
	}

}
