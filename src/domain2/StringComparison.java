package domain2;

public class StringComparison {
    public static void main(String[] args) {
        String product1 = "Coffee";
        String product2 = "Coffee";


        System.out.println("product1: " + product1);
        System.out.println("product2: " + product2);
        System.out.println(product1 == product2); // compares memory address
        System.out.println(product1.equals(product2)); // compares actual value
    }
}
