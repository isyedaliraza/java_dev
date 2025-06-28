package domain2;

public class ToStringConversion {
    public static void main(String[] args) {
        String name = "John";
        int qty = 5;
        String product = "Coffee";

        // We can convert any object type to a String
        // using its toString static method
        System.out.println(name + " ordered " + 
        Integer.toString(qty) + " packs of " + product);


        // If we don't know the type of object we can use
        // String class valueOf static method too
        System.out.println(name + " ordered " + 
        String.valueOf(qty) + " packs of " + product);
    }
}
