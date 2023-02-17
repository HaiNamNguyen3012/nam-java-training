package brocode;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] cars =   {
                {"Camaro","Corvette","Silverado"},
                {"Mustang", "Mozilla", "Lamborghini"},
                {"Mazda","Ferrari","Toyota"}
            };


		for(int i  = 0; i < cars.length; i++){
			System.out.println();
			for(int j = 0; j < cars[i].length; j++){
				System.out.print(cars[i][j] + " ");
			}
		}
	}

}
