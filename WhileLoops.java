import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // A while loop repeats a block of code as long as a given condition is true.
        int count = 1;
        while (count<=5){
            System.out.println("Count is: " + count);
            count++;
        }

        // PASSWORD VALIDATOR
        String correctPassword = "java123";
        String enteredPassword = "";

        while (!enteredPassword.equals(correctPassword)) {
            System.out.print("Enter your password: ");
            enteredPassword = scanner.nextLine();

            if (!enteredPassword.equals(correctPassword)) {
                System.out.println("❌ Wrong password! Try again.");
            }
        }

        System.out.println("✅ Access Granted!");
scanner.close();
       }

    }

