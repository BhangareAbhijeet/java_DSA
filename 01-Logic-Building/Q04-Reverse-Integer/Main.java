
import java.util.Scanner;

public class Main{

    //with stringBuilder..........

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter a number:-  ");
    //     int n =sc.nextInt();
    //     String  reversed=new StringBuilder(String.valueOf(n)).reverse().toString();

    //     System.out.println("Original number: "+n);
    //     System.out.println("Reversed number: "+reversed);
    // }

    //without stringBuilder.........using dsa logic
    public static void main(String[] args) {
        int n = -12345;
        int reversed = 0;

        while (n != 0 ) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
             if (reversed > Integer.MAX_VALUE ||
                reversed < Integer.MIN_VALUE) {

                
            }
        }
        System.out.println("Reversed number: " + reversed);
    }
}