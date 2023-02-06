package broCode;

public class Array_2D {
    public static void main(String[] args){
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
