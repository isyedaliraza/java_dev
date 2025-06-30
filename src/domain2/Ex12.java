package domain2;

public class Ex12 {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 3;

        int resultAddition = num1 + num2;
        int resultSubtraction = num1 - num2;
        int resultMultiplication = num1 * num2;
        int resultDivision = num1 / num2;
        int resultRemainder = num1 % num2;

        System.out.println(String.format("Result of addition: %d", resultAddition));
        System.out.println(String.format("Result of subtraction: %d", resultSubtraction));
        System.out.println(String.format("Result of multiplication: %d", resultMultiplication));
        System.out.println(String.format("Result of division: %d", resultDivision));
        System.out.println(String.format("Remainder (if any) when num1 / num2: %d", resultRemainder));
    }
}
