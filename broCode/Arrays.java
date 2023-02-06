package broCode;

public class Arrays {
    public static void main(String[] args){
        String[] cars = {"Camaros", "Corvette", "Tesla", "BMW"};

        cars[0] = "Mustang";

        for(int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }
    }
}
