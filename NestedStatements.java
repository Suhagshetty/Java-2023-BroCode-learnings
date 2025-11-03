import java.util.Scanner;

public class NestedStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter signal color: ");
        String color = scanner.nextLine();
        System.out.println("Is the road clear? ");
        String clear = scanner.nextLine();
        if(color.equalsIgnoreCase("red")){
            System.out.println("STOP");
        }else if (color.equalsIgnoreCase("yellow")){
            System.out.println("Wait");
        }else{
            System.out.println("Go!");
        }
        scanner.close();
    }
}
