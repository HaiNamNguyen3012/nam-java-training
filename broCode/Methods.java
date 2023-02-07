package broCode;

public class Methods {
    public static void main(String[] args){
        // String name = "Nam";
        // hello(name,0);
        int x = 6;
        int y = 9;
        int z = add(x,y);
        System.out.println(z);
    }
    static void hello(String name, int age){
        System.out.println("Hello " + name);
        System.out.println("You are " + age);
    }

    static int add(int x, int y){
        int z = x + y;
        return z;
    }
}
