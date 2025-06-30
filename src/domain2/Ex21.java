package domain2;

public class Ex21 {
    public static void main(String[] args) {
        String message1 = new String("Ship in a bottle");
        String message2 = new String("Ship in a bottle");

        System.out.println(message1 == message2);
        System.out.println(message1.equals(message2));
    }
}
