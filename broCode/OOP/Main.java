package broCode.OOP;
public class Main {
    public static void main(String[] args){
        //OOP Object 
        // Car myCar1 = new Car();
        // System.out.println(myCar1.make);
        // System.out.println(myCar1.model);
        // myCar1.drive();
        // myCar1.brake();

        //OOP constructor
        // Human human1 = new Human("Nguyen Hai Nam", 22, 84);
        // Human human2 = new Human("Nguyen Thuc Anh", 21, 50);
        
        // System.out.println(human1.name);
        // human2.eat();
        // human1.drink();

        Pizza pizza = new Pizza("thicc crust", "tomato");
        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
    }
}
