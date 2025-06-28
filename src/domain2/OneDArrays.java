package domain2;

public class OneDArrays {
    public static void main(String[] args) {
        
        String[] products = new String[2];
        products[0] = "Coffee";
        products[1] = "Bread";

        for (String product: products) {
            System.out.println(product);
        }

        // Another method to create an array

        String[] colors = {"Red", "Orange", null, "Yellow", "Green"};
        for (String color: colors) {
            System.out.println(color);
        }
    }
}
