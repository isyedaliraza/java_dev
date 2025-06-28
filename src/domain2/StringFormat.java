package domain2;

public class StringFormat {
    public static void main(String[] args) {
        String product1 = "Coffee";
        String product2 = "Bread";

        System.out.println(String.format("|%10s|", product1));
        System.out.println(String.format("|%10s|", product2));

        String name = "Syed Ali Raza";
        short age = 31;

        String message = "Hello %s, how're you? You're %d years old.";
        System.out.println(String.format(message, name, age));
    }
}
