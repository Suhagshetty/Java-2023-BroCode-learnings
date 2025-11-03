import java.util.Scanner;

public class TernaryOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the pump house!");
        System.out.println("Whats your age?");
        int age = scanner.nextInt();
        String result = (age>=18) ? "I would lke some wine" : "I would get a water";
        System.out.println(result);

        // TEMPERATURE CHECK USING TERNARY OPERATOR
        System.out.println("Welcome to temperature check!");
        System.out.println("Enter your temparature in C");
        double c = scanner.nextDouble();
        String resultanatTemperature = (c>=30)? "Hot Day"
: "Pleasant Day";
        System.out.println(resultanatTemperature);
        scanner.close();
    }
}
