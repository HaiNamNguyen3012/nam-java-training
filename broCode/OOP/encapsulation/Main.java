package broCode.OOP.encapsulation;

public class Main {
    /*
     * Encapsulation in Java is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.
     * Attributes of a class will be hidden or private
     * Can be accessed only through methods (getter, setter)
     * You should make attributes private if you don't have a reason to make them public/protected
     */
    public static void main(String[] args) {
        Car car = new Car("Chevrolet", "Camaro", 2021);
    
        car.setYear(2023);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
}
