package domain3;

public class ExPart1 {
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
        ex14();
    }

    public static void ex14() {
        boolean hasCarFueled = true;
        boolean isCarInsured = false;
        String message;
        if (hasCarFueled && isCarInsured) {
            message = "The car has fuel and is insured. The road trip can go ahead.";
        } else if (hasCarFueled && isCarInsured == false) {
            message = "The car has fuel, but it's not insured. The road trip can not proceed!";
        } else if (hasCarFueled == false && isCarInsured == false) {
            message = "The car needs both fuel and insurance. The road trip can not proceed!";
        } else {
            message = "Invalid Data";
        }

        System.out.println(message);
    }

    public static void ex13() {
        byte numberOfMilesCovered = 10;

        String message;
        switch (numberOfMilesCovered) {
            case 25:
            case 20:
            case 15:
            case 10:
            case 5:
                message = "Water is available at this mark.";
                break;
            default:
                message = "Water is not available now.";
        }

        System.out.println(message);
    }

    public static void ex12() {
        char status = 'D';
        
        String message;
        switch (status) {
            case 'S':
                message = "Status: Single";
                break;
            case 'D':
                message = "Status: Divorced";
                break;
            case 'M':
                message = "Status: Married";
                break;
            case 'W':
                message = "Status: Widowed";
                break;
            default:
                message = "Invalid data.";
        }

        System.out.println(message);
    }

    public static void ex11() {
        int noOfFishInTank = 3;
        String message;

        switch (noOfFishInTank) {
            case 0:
                message = "There are no fish in the tank.";
                break;
            case 1:
                message = "There is one fish in the tank.";
                break;
            case 2:
                message = "There are two fishes in the tank.";
                break;
            case 3:
                message = "There are three fishes in the tank.";
                break;
            default:
                message = "An indeterminate number of fishes are in the tank.";
        }

        System.out.println(message);
    }

    public static void ex10() {
        String dayOfWeek = "Monday";
        switch(dayOfWeek) {
            case "Monday":
                System.out.println("The day is Monday.");
                break;
            case "Tuesday":
                System.out.println("The day is Tuesday.");
                break;
            case "Wednesday":
                System.out.println("The day is Wednesday.");
                break;
            case "Thursday":
                System.out.println("The day is Thursday.");
                break;
            case "Friday":
                System.out.println("The day is Friday.");
                break;
            case "Saturday":
                System.out.println("The day is Saturday.");
                break;
            default:
                System.out.println("The day is Sunday.");
        }
    }

    public static void ex9() {
        float temp = 24.19f;
        String message;

        if (temp >= 20) {
            message = "tropical";
        } else if (temp >= 10) {
            message = "warm";
        } else if (temp >= 0) {
            message = "moderate";
        } else if (temp >= -4) {
            message = "cold";
        } else {
            message = "arctic";
        }

        System.out.println(message + " temperature");
    }

    public static void ex8() {
        float score = 45.00f;
        String grade;

        if (score >= 85) {
            grade = "A";
        } else if (score >= 70) {
            grade = "B";
        } else if (score >= 55) {
            grade = "C";
        } else if (score >= 40) {
            grade = "D";
        } else if (score >= 25) {
            grade = "E";
        } else if (score >= 10) {
            grade = "F";
        } else {
            grade = "No Grade";
        } 

        System.out.println("Grade achieved: " + grade);
    }

    public static void ex7() {
        int productsSold = 500;
        byte yearsOfService = 10;
        float sales = 50000f;

        if (productsSold >= 1000 && yearsOfService >= 20 && sales >= 10000) {
            System.out.println("You have qualified for a bonus.");
        } else {
            System.out.println("You have not qualified for a bonus.");
        }
    }

    public static void ex6() {
        byte age = 19;
        boolean isSober = false;

        if (age >= 18 && isSober) {
            System.out.println("Welcome to the pub!");
        } else {
            System.out.println("Not tonight, Sorry.");
        }
    }

    public static void ex5() {
        int amount = 20;
        int balance = 180;
        String message = balance >= amount ? "Withdrawal processed" : "Insufficient funds";
        System.out.println(message);
    }

    public static void ex4() {
        int amount = 20;
        int balance = 180;

        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal processed: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public static void ex3() {
        boolean hasPermit = false;
        byte age = 19;

        if (hasPermit && age > 18) {
            System.out.println("You can go on the fishing trip.");
        } else {
            System.out.println("You can't go on the fishing trip as you do not meet the qualifying criteria.");
        }
    }

    public static void ex2() {
        int people = 2;
        if (people > 5) {
            System.out.println("The fishing trip will go ahead.");
        } else {
            System.out.println("The fishing trip will not go ahead. Insufficient numbers.");
        }
    }

    public static void ex1() {
        boolean hasPermit = true;
        if (hasPermit) {
            System.out.println("You can go on the fishing trip as you've a permit.");
        } else {
            System.out.println("You can't go on the fishing trip without a permit.");
        }
    }
}
