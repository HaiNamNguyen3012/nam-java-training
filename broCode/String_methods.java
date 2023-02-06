package broCode;

public class String_methods {
    public static void main(String[] args) {
        String name = "Nam";

        // boolean result = name.equalsIgnoreCase("nam");
        // int result = name.length();
        // char result = name.charAt(0);
        // int result = name.indexOf("am");
        // boolean result = name.isEmpty();
        // String result = name.toLowerCase();
        // String result = name.toUpperCase();
        // String result = name.trim();
        String result = name.replace('a', 'o');
        System.out.println(result);
    }
}
