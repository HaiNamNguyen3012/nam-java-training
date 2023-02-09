package broCode.OOP.overloaded_constructor;

//Overloaded constructor
public class Pizza {
    /*
     *  Overloaded constructor = mutiple constructors within a class within a class with the same name
     *  but have different parameters
     *  name + parameters = signature
     */
    String bread;
    String sauce;
    String cheese;
    String topping;
    Pizza(String bread, String sauce, String cheese, String topping){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }
    Pizza(String bread, String sauce, String cheese){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }
    Pizza(String bread, String sauce){
        this.bread = bread;
        this.sauce = sauce;
    }
    Pizza(String bread){
        this.bread = bread;
    }
    Pizza(){}
}
