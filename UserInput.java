import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Whats your Name:- ");
//        String name  = scanner.nextLine();
//        System.out.println("Whats your age? ");
//        int age = scanner.nextInt();
//        System.out.println("Whats your percentage? ");
//        double percentage = scanner.nextDouble();
//
//        System.out.println("So your name is " + name  + " age is "  + age + " percentage is " + percentage);
//
//        // AREA OF RECTANGE
//
//        System.out.println("Enter Lenght:- ");
//        double length = scanner.nextDouble();
//        System.out.println("Enter Width:- ");
//        double width = scanner.nextDouble();
//        double area = width*length;
//        System.out.println("Area is "  + area);

String adjective;
String noun;
String adjective2;
String verb1;
String adjective3;
        System.out.println("Enter an Adjective: ");
        adjective  =scanner.nextLine();
        System.out.println("Enter a noun: ");
        noun = scanner.nextLine();
        System.out.println("Enter an adjective: ");
        adjective2 = scanner.nextLine();
        System.out.println("Enter a verb: ");
        verb1 = scanner.nextLine();
        System.out.println("The adjective is ");
        adjective3 = scanner.nextLine();
        System.out.println("Today i went to a "  + adjective +  " and i saw a "  +noun +  " and I saw another "  + adjective2   + " it was too "  + verb1    + " and lenghty " +  adjective3);

    }
}
