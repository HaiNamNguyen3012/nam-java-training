package broCode;

public class Method_printf {
    
    public static void main(String[] args){
        boolean myBoolean = false;
        char myChar = '@';
        String myString = "Nam";
        int myInteger = 50;
        double myDouble = 1000;

        // [conversion-character]

        // System.out.printf("%b", myBoolean);
        // System.out.printf("%c", myChar);
        // System.out.printf("%s", myString);
        // System.out.printf("%d", myInteger);
        // System.out.printf("%f", myDouble);

        //[width]
        // minimum number of characters to be written as output
        // System.out.printf("Hello %10s", myString);

        //[precision]
        //Sets number of digits of precision when outputing floating-pint values
        System.out.printf("You have this much money %,f", myDouble);
    }
}
