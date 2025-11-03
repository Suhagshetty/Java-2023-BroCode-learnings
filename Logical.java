import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age!");
        int age = scanner.nextInt();
        if(age>=0&&age<18){ // [ both condition must be true]
            System.out.println("You are still an kid");
        }else {
            System.out.println("You can drive!");
        }
        System.out.println(!true); // INVERTS THE VALUE [ ! ]

        // MOVIE TICKET BOOKING 
        System.out.println("Welcome to movie night!");
        System.out.println("PLEASE ENTER YOUR AGE!");
        int movieAge  = scanner.nextInt();
        System.out.println("Do u have your parents permission? ");
        boolean permission = scanner.nextBoolean();
        scanner.nextLine();

        if (age >= 18 || (age >= 15 && age <= 17 && permission)) {
            System.out.println("✅ You can watch this movie!");
        } else {
            System.out.println("❌ You are not allowed to watch this movie.");
        }

        scanner.close();
    }
}
