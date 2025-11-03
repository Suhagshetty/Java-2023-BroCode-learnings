import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String length = "Suhag";
        System.out.println(length.length());
        String character = "Java BroCode";
        System.out.println(character.charAt(2));
        String upperCase = "suhag s shetty";
        System.out.println(upperCase.toUpperCase());
        String lowerCase = "SUHAG";
        System.out.println(lowerCase.toLowerCase());
        System.out.println("Hi".equals("hi"));
        System.out.println("Hi".equalsIgnoreCase("hi"));
        System.out.println("Hello world".contains("world"));
        System.out.println("Suhag".startsWith("S"));
        System.out.println("Shetty".endsWith("y"));
        System.out.println("Hi    ".trim());
        System.out.println("Shetty suhag".replace("h","c"));
        System.out.println("Java is fun".split(""));


        // USERNAME VALIDATOR
        System.out.println("Enter the username ");
        String username  = scanner.nextLine();
        if(username.contains(" ")){
            System.out.println("InValid username");
        }else{
           if (username.length()<6){
               System.out.println("Invalid username");
           }else{
               char firstChar=username.charAt(0);
               if (Character.isLetter(firstChar)){
                   System.out.println("Valid username");
               }else{
                   System.out.println("Invalid username");
               }
           }
        }
        scanner.close();
    }
}
