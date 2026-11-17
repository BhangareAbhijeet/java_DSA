
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("You entered: " + number);

        if (number<1) {
            System.out.println("invalid input. Please enter a positive integer.");
        } else {
            for (int i = 1; i <= number; i++) {
                System.out.print(i + " ");
            }
        }
    }
    
}
