package brocode.oop.arrayofobjects;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Food food1 = new Food("pizza");
	     Food food2 = new Food("hamburger");
	     Food food3 = new Food("hotdog");
	     Food[] refrigerator = {food1, food2, food3};

	     System.out.println(refrigerator[0].name);
	     System.out.println(refrigerator[1].name);
	     System.out.println(refrigerator[2].name);
	}

}
