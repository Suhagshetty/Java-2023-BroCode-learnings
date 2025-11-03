import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kindly role a Dice! ");
        int Dice = random.nextInt(6)+1;
        System.out.println("You rolled a " + Dice);

        // HEAD OR TAILS
        boolean headOrTails;
        headOrTails = random.nextBoolean();
        if(headOrTails){
            System.out.println("Heads");
        }else {
            System.out.println("Tails");
        }

        // MATH CLASS IN JAVA
        System.out.println(Math.max(10,90)); // 90
        System.out.println(Math.min(10,90)); // 10
        System.out.println(Math.sqrt(4)); // 16
        System.out.println(Math.pow(2,3)); // 8.0
        System.out.println(Math.abs(-7)); // 7
        System.out.println(Math.round(4.6)); // 5
        System.out.println(Math.floor(4.9)); // 4.0
        System.out.println(Math.ceil(4.1)); // 5.0

        // PROGRAM TO FIND CO ORDINATES OF POINTS
        System.out.println("Enter point 1");
        int point1 = scanner.nextInt();
        System.out.println("Enter point 2");
        int point2 = scanner.nextInt();
        System.out.println("Enter cord 1");
        int cord1 = scanner.nextInt();
        System.out.println("Enter cord2");
        int cord2 = scanner.nextInt();
        double distance = Math.sqrt(Math.pow(point2 - point1, 2) + Math.pow(cord2 - cord1, 2));
        System.out.println("The distance is "  + distance);

        // COMPOUND INTEREST CALCULATOR

        System.out.println("Enter principal amount: ");
        double principal1 =scanner.nextDouble();
        System.out.println("Enter annual interest rate: ");
        double interestRate = scanner.nextDouble();
        System.out.println("Enter the time in years: ");
        int years = scanner.nextInt();
        System.out.println("Enter the interest rate: ");
        double intrest = scanner.nextDouble();
        double amount = principal1*Math.pow(1+(interestRate/100)/intrest,intrest*years);
        double compoundInterest = amount-principal1;
        System.out.println("The compound interest is " + compoundInterest);
        scanner.close();
    }
}
