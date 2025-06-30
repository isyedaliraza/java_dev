package domain2;

public class Ex24 {
    public static void main(String[] args) {
        String x = new String("Java");
        x = x.concat(" Rules");
        System.out.println("x = " + x);  // x = Java Rules
        x.toUpperCase();
        System.out.println("x = " + x);  // x = Java Rules
        x.replace('a', 'X');
        System.out.println("x = " + x);  // x = Java Rules
        x = x.concat(" Rules!");
        System.out.println("x = " + x);  // x = Java Rules Rules!
    }
}
