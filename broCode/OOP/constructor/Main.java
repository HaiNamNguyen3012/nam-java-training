package broCode.OOP.constructor;

public class Main {
    public static void main(String[] args){
        //OOP constructor
        Human human1 = new Human("Nguyen Hai Nam", 22, 84);
        Human human2 = new Human("Nguyen Thuc Anh", 21, 50);
        System.out.println(human1.name);
        human2.eat();
        human1.drink();
    }
}
