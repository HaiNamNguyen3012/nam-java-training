package brocode;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars = {"Camaros", "Corvette", "Tesla", "BMW"};

        cars[0] = "Mustang";

        for(int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }
	}

}
