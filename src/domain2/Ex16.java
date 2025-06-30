package domain2;

public class Ex16 {
   public static void main(String[] args) {
    float totalInvestment = 1000f;
    float interestRate = 0.05f;
    float interestEarned = totalInvestment * interestRate;
    float total = totalInvestment + interestEarned;

    System.out.println(String.format("The principal is %.2f euro", totalInvestment));
    System.out.println(String.format("The rate of interest is %.2f", interestRate));
    System.out.println(String.format("The interest earned is %.2f", interestEarned));
    System.out.println(String.format("The value of investment is: %.2f euro", total));
   } 
}
