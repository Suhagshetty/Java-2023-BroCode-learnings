import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int number = 10;
        System.out.println("Number Guessing Game");
        System.out.println("Guess a number between 1-100");
        int guess = scanner.nextInt();
        if(guess>number){
            System.out.println("Too High!");
        } else if (guess<number) {
            System.out.println("Too Low");
        } else if (guess==number) {
            System.out.println("Correct");
        }
        scanner.close();
    }
}
