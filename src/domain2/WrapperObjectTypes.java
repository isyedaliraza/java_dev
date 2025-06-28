package domain2;

public class WrapperObjectTypes {
    public static void main(String[] args) {
        Integer a = Integer.valueOf("10");
        int b = 5;

        System.out.println(a + " + " + b + " = " + (a + b));

        String name = "syed ali raza";

        System.out.println("Your name is " + name.length() + " characters long.");
        System.out.println(name.toUpperCase());

    }
}
