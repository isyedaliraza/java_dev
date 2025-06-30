package domain2;

import java.util.*;

public class ArrayAndArrayListEx {
    public static void main(String[] args) {
        //ex1();
        //ex4();
        //ex6();
        //ex12();
        //ex13();
        //ex14();
        //ex15();
        //ex16();
        ex19();
    }

    public static void ex19() {
        ArrayList<String> filmStars = new ArrayList<>();

        filmStars.add("Elvis Presley");
        filmStars.add("Marilyn Monroe");
        filmStars.add("James Dean");
        filmStars.add("Rita Davies");

        filmStars.add(2, "Cary Grant");

        System.out.format("Is Marilyn Monroe in the list? %s\n", filmStars.contains("Marilyn Monroe"));
        System.out.format("At index position four of the list is: %s\n", filmStars.get(4));
        System.out.format("James Dean is at index position: %d\n", filmStars.indexOf("James Dean"));
        
        filmStars.remove("Rita Davies");

        System.out.println("Printing the contents of the Arraylist:");
        for (String star: filmStars) {
            System.out.println(star);
        }

    }

    public static void ex16() {
        ArrayList<Integer> values = new ArrayList<>();
        values.add(10);
        values.add(11);
        values.add(12);
        values.add(13);

        System.out.format("The size of the Arraylist is %d\n", values.size());
        System.out.println("**********");
        values.remove(1);
        System.out.format("The size of the Arraylist is %d\n", values.size());
        System.out.println("**********");
        System.out.println("The contents of the Arraylist is:");
        for (Integer value: values) {
            System.out.println(value);
        }
    }

    public static void ex15() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Eye of the Tiger");
        list.add("Footloose");
        list.add("Happy");
        list.add("Kiss from a Rose");
        list.add("Stayin Alive");

        list.remove("Footloose");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    public static void ex14() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Eye of the Tiger");
        list.add("Footloose");
        list.add("Happy");
        list.add("Kiss from a Rose");
        list.add("Stayin Alive");

        list.remove("Footloose");

        for (String item: list) {
            System.out.println(item);
        }

    }

    public static void ex13() {
        ArrayList<String> movies = new ArrayList<>();
        movies.add("Indiana Jones and the Dial of Destiny");
        movies.add("The Super Mario Bros. Movie");
        movies.add("Barbie");
        movies.add("Oppenheimer");

        System.out.println(movies.get(1));
    }

    public static void ex12() {
        int[] salaries = {25000, 20000, 45000};
        int totalSalaries = 0;
        for (int salary: salaries) {
            totalSalaries += salary;
        }
        int averageSalaries = totalSalaries / salaries.length;

        System.out.format("Total Salaries: %d\n", totalSalaries);
        System.out.format("Average Salaries: %d\n", averageSalaries);
    }

    public static void ex6() {
        String[][] countries = new String[2][6];
       
        countries[0][0] = "China";
        countries[0][1] = "Hong Kong";
        countries[0][2] = "Taiwan";
        countries[0][3] = "Japan";
        countries[0][4] = "Qatar";
        countries[0][5] = "Bahrain";
       
        countries[1][0] = "Ireland";
        countries[1][1] = "UK";
        countries[1][2] = "France";
        countries[1][3] = "Spain";
        countries[1][4] = "Portugal";
        countries[1][5] = "Germany";

        System.out.println(countries[0][4]);
        System.out.println(countries[1][2]);
    }

    public static void ex4() {
        float[] temperatures = {12.5f, 15.65f, 20.45f, 19.44f};
        System.out.println(temperatures[2]);
    }

    public static void ex1() {
        String[] daysOfWeek = new String[7];
        daysOfWeek[0] = "Monday";
        daysOfWeek[1] = "Tuesday";
        daysOfWeek[2] = "Wednesday";
        daysOfWeek[3] = "Thursday";
        daysOfWeek[4] = "Friday";
        daysOfWeek[5] = "Saturday";
        daysOfWeek[6] = "Sunday";

        for (String day:daysOfWeek) {
            System.out.println(day);
        }
    }
}
