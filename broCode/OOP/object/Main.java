package broCode.OOP.object;

public class Main {
    public static void main(String[] args){
        //OOP Object 
        Car myCar1 = new Car();
        System.out.println(myCar1.make);
        System.out.println(myCar1.model);
        myCar1.drive();
        myCar1.brake();
    }
}
