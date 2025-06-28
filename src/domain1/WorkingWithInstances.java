package domain1;

public class WorkingWithInstances {
    public static void main(String[] args) {
       Product p1 = new Product("Gold Blend", "Tea", 15.99); 
       Product p2 = new Product("Caramel Latte", "Coffee", 20.0); 

       System.out.println("We have the following products in our app:");
       System.out.println(p1.name + " (€ " + p1.price + ")");
       System.out.println(p2.name + " (€ " + p1.price + ")");
       p2.addToCart();
    }
}

class Product {
    String name;
    String type;
    double price;

    Product(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public void addToCart() {
        System.out.println(this.name + " has been added to the cart!");
    }
}
