package domain2;

import java.util.*;

public class ArrayListJava {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<String>();
        products.add("Coffee");
        products.add("Bread");
        products.add("Tea");

        System.out.println(products.get(1)); // Bread

        Iterator<String> listOfProducts = products.iterator();
        while (listOfProducts.hasNext()) {
            System.out.println(listOfProducts.next());
        }
    }
}
