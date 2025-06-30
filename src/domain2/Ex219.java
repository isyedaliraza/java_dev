package domain2;

public class Ex219 {
    public static void main(String[] args) {
        float euros = 100.75f;
        float euroToPoundXERate = 0.87f;
        float sterling = euros * euroToPoundXERate;

        System.out.format("Euro Amount %.2f is equal to Sterling Amount %.2f. The exchange rate used was %.2f.",
        euros, sterling, euroToPoundXERate);
    }
}
