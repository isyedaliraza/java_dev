public class VariableScope {
    public static void main(String[] args) {
        String county = "Laois";

        double salesTax = 0;
        if (county == "Laois") {
            salesTax = 0.04;
        } else {
            salesTax = 0.05;
        }

        System.out.println("Sales tax in county " + county + " is " + salesTax * 100 + "%.");
    }
}
