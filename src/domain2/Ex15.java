package domain2;

public class Ex15 {
    public static void main(String[] args) {
        int totalMinutes = 199;
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        System.out.println(String.format("No. of minutes: %d", totalMinutes));
        System.out.println("The time clock has converted it to:");
        System.out.println(String.format("Hours: %d Minutes: %d", hours, minutes));
    }
}
