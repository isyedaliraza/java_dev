package domain2;

public class Ex13 {
    public static void main(String[] args) {
        float price = 14.50f;
        float vatRate = 0.23f;
        float vatAmount = price * vatRate;
        float totalPrice = price + vatAmount;

        System.out.println(String.format("Purchase Amount: %.2f", price));
        System.out.println(String.format("Vat Payable: %.2f", vatAmount));
        System.out.println(String.format("Total Price: %.2f", totalPrice));
    }
}
