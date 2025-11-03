import java.util.Scanner;

public class Arthmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Pizza1 = 11;
        int Pizza2 = 9;
        double Pizza3 = 13.69;
        double total = Pizza1+Pizza3+Pizza2;
        System.out.println("Hello Welcome to Domino's! What can i get for you today? ");
        System.out.println("We have 3 pizza's now which one would u like");
        System.out.println("I want all three");

        System.out.println("Your total bill is " + total);

        // ARTHMETIC OPERATORS IN JAVA
        // [ + ,-,%,/,* ]

        // AUGMENTED ASSIGNMENT OPERATORS
       // [+=,-=,/=,*=]
        scanner.close();
    }
}
