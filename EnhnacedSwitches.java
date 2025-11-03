import java.util.Scanner;

public  class EnhnacedSwitches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day of the week!");
        String day =scanner.nextLine();
        switch (day.toLowerCase()) {
            case "monday" -> System.out.println("First day of the week");
            case "tuesday" -> System.out.println("Plan for the day");
            case "wednesday" -> System.out.println("CODE");
            case "thursday" -> System.out.println("Halfway through!");
            case "friday" -> System.out.println("Almost weekend!");
            case "saturday" -> System.out.println("Weekend vibes!");
            case "sunday" -> System.out.println("Rest day!");
            default -> System.out.println("Invalid day");
        }

        // GRADE CALCULATOR
        System.out.println("Enter your Grade!");
        String grade = scanner.nextLine();
        switch (grade.toLowerCase()){
            case "a"->System.out.println("Excellent!");
            case "b"->System.out.println("Good!");
            case "c"->System.out.println("Try To Improve!");
            case "d"->System.out.println("Work Hard!");
            case "f"->System.out.println("Die!");
            default -> System.out.println("Invalid Grade entered bsdk");

        }
        scanner.close();
    }
}