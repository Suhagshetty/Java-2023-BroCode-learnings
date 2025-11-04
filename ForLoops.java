import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // FOR LOOPS IN JAVA executes some code a certain amount of time.
        int i;
        for(i=0;i<=10;i++){
            System.out.println("Repetation " + i);
        }
        // TABLES IN JAVA USING FOR LOOP
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        System.out.println("Multiplicationn table for "  +number + "is");
        for(int ii=1;ii<=10;ii++){
            System.out.println(number+"x"+ii+"="+number*ii);
        }
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int sum=0;
        for(int iii = 0;iii<=n;iii++){
            if(iii%2==0){
                sum+=iii;
            }
        }
        System.out.println("Sum of the even numbers is "  + sum);

        scanner.close();
    }
}
