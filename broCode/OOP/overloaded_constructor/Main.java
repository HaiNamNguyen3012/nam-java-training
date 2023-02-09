package broCode.OOP.overloaded_constructor;

public class Main {
    public static void main(String[] args){
        // overloaded constructor
        Pizza pizza = new Pizza("thicc crust", "tomato");
        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
    }
}
