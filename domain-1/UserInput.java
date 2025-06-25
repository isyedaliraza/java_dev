import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter your name: ");

        String name = in.nextLine();

        System.out.println("Hi " + name + ", welcome to our app!");

        in.close();
    }
}
