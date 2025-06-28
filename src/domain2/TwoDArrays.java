package domain2;

public class TwoDArrays {
    public static void main(String[] args) {
        String[][] table = new String[2][2];
        table[0][0] = "Q1";
        table[0][1] = "Q2";
        table[1][0] = "Q3";
        table[1][1] = "Q4";

        System.out.println(table[0][1]);

        String[][] anotherTable = {{"Q1", "Q2"}, {"Q3", "Q4"}, {"Q5", "Q6", "Q7"}};
        System.out.println(anotherTable[2][2]);
    }
}
