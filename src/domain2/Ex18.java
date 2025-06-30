package domain2;

public class Ex18 {
    public static void main(String[] args) {
        float length = 25f;
        float width = 42f;
        float areaSqft = length * width;
        float areaSqy = areaSqft / 9;
        float costPerSqy = 37.99f;
        float totalCost = areaSqy * costPerSqy;

        System.out.println("********** Carpet Cost Analysis **********");
        System.out.println(String.format("Square feet: %f", areaSqft));
        System.out.println(String.format("Square yards: %f", areaSqy));
        System.out.println(String.format("Cost of carpeting in Square yards: %.2f", totalCost));
    }
}
