package domain3;

public class Exercise2 {
    public static void main(String[] args) {
        int savings = 500;
        int[] amounts = { 60, 20, 100, 80, 40, 300, 200, 100 };

        int index = 0;
        while (index < amounts.length) {
            System.out.format("Cash in the pot: %d%n", savings);

            if (amounts[index] <= savings) {
                System.out.format("Loan amount requested: %d - Loan amount granted!%n%n", amounts[index]);
                savings -= amounts[index];
                index++;
            } else {
                System.out.format("Loan amount requested: %d%n", amounts[index]);
                System.out.println(
                        "The exact loan request amount cannot be processed in full (insufficient funds available).");
                System.out.format("However, we will give you what we can... %d%n%n", savings);
                savings = 0;
                index++;
                break;
            }
        }

        if (index < amounts.length) {
            System.out.println("The following loan requests could not be facilitated.");
            while (index < amounts.length) {
                System.out.println(amounts[index]);
                index++;
            }
        }
    }
}
