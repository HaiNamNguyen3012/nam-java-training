package brocode.oop.variablescope;

import java.util.Random;

public class DiceRoller {
	Random random;
    int number = 0;
    DiceRoller(){
        random = new Random();
        roll();
    }

    void roll() {
        number = random.nextInt(10)+1;
        System.out.println(number);
    }
}
