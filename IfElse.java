import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        // IF ELSE STATEMENT = performs a block of code if the condition is true.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks you have score");
        int marks = scanner.nextInt();
        if(marks<=50){
            System.out.println("You have Failed the test! "  +marks);
        } else if (marks>=90 && marks<100) {
            System.out.println("Topper"  +marks);
        } else if (marks >=80&&marks<=89) {
            System.out.println("Good "  + marks);
        }
        else if (marks>=70&&marks<=79){
            System.out.println("The grade is B " + marks);
        }
        scanner.close();
    }
}
