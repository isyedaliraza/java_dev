package domain1;

public class CommandLineArgs {
    public static void main(String[] args) {
        String firstArgument = args[0];
        if (firstArgument != null) {
            System.out.println("You've passed '" + firstArgument + "', as your first argument.");
        } else {
            System.out.println("You didn't pass any arguments.");
        }
    }
}
