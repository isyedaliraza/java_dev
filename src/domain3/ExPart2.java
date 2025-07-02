package domain3;

public class ExPart2 {
    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex5();
        //ex6();
        //ex7();
        //ex8();
        //ex9();
        //ex10();
        //ex11();
        //ex12();
        //ex13();
        //ex14();
        //ex15();
        ex16();
    }

    public static void ex16() {
        String[][] colours = {
            {"green", "white", "orange"},
            {"red", "white", "blue", "yellow", "black", "green"}
        };

        int row = 1;
        for (String[] i: colours) {
            System.out.print("Row " + row + " ");
            for (String j: i) {
                System.out.print(j + " ");
            }
            System.out.println();
            row++;
        }
    }

    public static void ex15() {
        float[][] temperatures = {
            {9.0f, 9.1f, 11.2f, 12.0f, 14.1f, 18.0f, 23.0f, 21.1f, 20.0f, 13.0f, 10.1f, 9.0f},
            {8.0f, 8.1f, 10.2f, 11.0f, 14.1f, 17.0f, 22.0f, 22.1f, 21.0f, 12.0f, 11.1f, 8.0f}
        };

        System.out.println("(i):");
        for (int i = 0; i < 2; i++) {
            System.out.println("Year " + (i + 1));
            for (int j = 0; j < 12; j++) {
                System.out.print(temperatures[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("(ii):");
        int y = 1;
        for (float[] i: temperatures) {
            System.out.println("Year " + y);
            for (float j: i) {
                System.out.print(j + " ");
            }
            System.out.println();
            y++;
        }
    }

    public static void ex14() {
        int[][] sales = new int[3][4];

        sales[0][0] = 12000;
        sales[0][1] = 13000;
        sales[0][2] = 14000;
        sales[0][3] = 15000;

        sales[1][0] = 13000;
        sales[1][1] = 14000;
        sales[1][2] = 15000;
        sales[1][3] = 16000;

        sales[2][0] = 10000;
        sales[2][1] = 12000;
        sales[2][2] = 15000;
        sales[2][3] = 13000;

        for (int i = 0; i < 3; i++) {
            System.out.println("Year " + (i + 1));
            for (int j = 0; j < 4; j++) {
                System.out.print(sales[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void ex13() {
        for (int i = -5; i <= 5; i++) {
            if (i == 0) {
                continue;
            }

            System.out.println(String.format(
                "The reciprocal of %d is %f",
                i,
                (float) 1 / i
            ));
        }
    }

    public static void ex12() {
        byte[] ages = {34, 16, 31, 19, 30, 19, 32, 11, 12, 13};
        String[] names = {"John Welsh", "Frank Hayes", "Anna Davis",
                          "Jennifer Burns", "Francis Burke", "Fred Smith",
                          "Phillipa Smith", "Jason Button", "Ian Hayes", "Derva Conway"};
        
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] <= 18) {
                continue;
            }

            System.out.println(String.format("%s - You are eligible to vote. Proceed to your polling station.",
            names[i]));
        }
    }

    public static void ex11() {
        char[] characters = {'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'N', 'Y', 'N', 'N'};
        int positive = 0;
        for (char c: characters) {
            if (positive == 7) {
                break;
            }

            if (c == 'Y') {
                positive++;
            }
        }

        if (positive >= 7) {
            System.out.println("The fishing trip will go ahead!");
        }
        else {
            System.out.println("The fishing trip will not go ahead!");
        }
    }

    public static void ex10() {
        String[] passwords = {
            "oxymoron",
            "poxedfox",
            "kingfisher",
            "cruiseshipper",
        };

        String password = "cruiseshipper";
        boolean found = false;

        for (String item: passwords) {
            if (item.equals(password)) {
                found = true;
                break;
            }
        }

        if (found) {
                System.out.println("Log-On Successful");
        }
        else {
            System.out.println("You cannot be logged on using the specified password.");
        }
    }

    public static void ex9() {
        String[] novels = {"Black Beauty", "Treasure Island", "Pride and Prejudice"};
        for (String n: novels) {
            System.out.print(n + " ");
        }

        System.out.println();
    }

    public static void ex8() {
        String[] colours = {"Blue", "Orange", "Yellow", "Green", "White", "Red", "Black"};
        for (String colour: colours) {
            System.out.println(colour);
        }
    }

    public static void ex7() {
        for (int i = 300; i >= 50; i -= 50) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void ex6() {
        for (int i = 5; i <= 30; i += 5) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void ex5() {
        String[] singers = {"Michael Jackson", "Frankie Goes To Hollywood", 
                            "Queen", "Simple Minds", "Rick Astley"};
        
        for (int i = 0; i < singers.length; i++) {
            System.out.println((5 - i) + ": " + singers[i]);
        }
    }

    public static void ex4() {
        for (int i = 0; i < 1; i++) {
            System.out.println("The loop ran " + (i + 1) + " time(s)");
        }
    }

    public static void ex3() {
        for (int i = 6; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public static void ex2() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void ex1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Learning Java is truly a rewarding experience.");
        }
    }
}
