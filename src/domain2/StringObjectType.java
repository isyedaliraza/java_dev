package domain2;

public class StringObjectType {
    public static void main(String[] args) {
        String product1 = "Tea";
        String product2 = "Coffee";

        System.out.println("|" + product1 + "|");
        System.out.println(String.format("|%s|", product2));

        // Strings in java are immutable
        String name = "John Doe";
        // We can reassign the variable
        // but the can't change the existing
        // it means immutable
        name = "Jane";
        System.out.println(name);
    }
}
