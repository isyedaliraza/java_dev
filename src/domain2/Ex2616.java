package domain2;

public class Ex2616 {
    
    public static void main(String[] args) {
        ex26();
        ex27();
        ex28();
        ex29();
        ex210();
        ex211();
        ex212();
        ex213();
        ex214();
        ex215();
        ex216();
    }

    public static void ex216() {
        String b = " double trouble ";
        b = b.trim();
        b = b.replaceAll("trouble", "bubble");
        System.out.println(String.format("The index position of the string, bubble is: %d",
        b.indexOf("bubble")));
    }

    public static void ex215() {
        String message = "One, two, buckle my shoe";
        System.out.println(message.indexOf("buckle"));
        System.out.println(message.endsWith("shoe"));
        System.out.println(String.format("The char at index position 2 is: %c", message.charAt(2)));
    }

    public static void ex214() {
        String message = "Duke's big day out!";
        System.out.println(message.contains("big"));
        String extractedMessage = message.substring(7, 10);
        System.out.println(extractedMessage);
        message = message.replaceAll("big", "magical");
        System.out.println(message);
    }

    public static void ex213() {
        String risingFootballStar = "Jude Bellingham";
        String stringExtract = risingFootballStar.substring(5, 9);
        System.out.println(stringExtract);
    }

    public static void ex212() {
        String name = "	Christopher N. Cross	";
        name = name.trim();
        System.out.println(String.format("No. of characters contained in the name: %s is %d.", 
                            name, name.length()));
    }

    public static void ex211() {
        String song = "FOLLOW THE YELLOW BRICK ROAD";
        System.out.println(song.toLowerCase());
    }

    public static void ex210() {
        String tale = "Curiosity killed the cat!";
        tale = tale.replace('k', 'f');
        System.out.println(tale);
    }

    public static void ex29() {
        String message = "Message in a bottle";
        System.out.println(String.format("Message length: %d chars.", message.length()));
    }

    public static void ex28() {
        String userEnteredPassword = "javabeans";
        String password = "JAVABEANs";
        if (userEnteredPassword.equalsIgnoreCase(password)) {
            System.out.println("Log-on successful");
        }
    }

    public static void ex27() {
        String userName = "Duke";
        userName = userName.concat(" Happy Birthday !!");
        System.out.println(userName);
    }

    public static void ex26() {
        String text = "Java Bean";
        System.out.println(String.format("The sixth char in the string is: %c", text.charAt(6)));
    }
}
