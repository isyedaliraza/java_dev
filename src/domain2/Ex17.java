package domain2;

public class Ex17 {
    public static void main(String[] args) {
        int amount = 57;
        int sum = amount;
        int twenty = sum / 20;
        sum %= 20;
        int ten = sum / 10;
        sum %= 10;
        int five = sum / 5;
        sum %= 5;
        int one = sum;

        System.out.println("********** Coin Machine **********");
        System.out.println(String.format("Sum of money is %d euro", amount));
        System.out.println(String.format("No of 20's: %d", twenty));
        System.out.println(String.format("No of 10's: %d", ten));
        System.out.println(String.format("No of 5's: %d", five));
        System.out.println(String.format("No of 1's: %d", one));
    }
}
