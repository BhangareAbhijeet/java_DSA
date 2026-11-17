
public class Main {

    // BruteForce Approach
    // public static void main(String[] args) {
    //     int n = 12345;
    //     String str = String.valueOf(n);
    //     int sum = 0;
    //     for (int i = 0; i < str.length(); i++) {
    //         sum += str.charAt(i) - '0';
    //     }
    //     System.out.println(sum);
    // }
    //Mathematical Approach
    public static void main(String[] args) {

        int n = 12345;
        int sum = 0;

        while (n > 0) {

            int digit = n % 10;

            sum += sum + digit;
            n = n / 10;

        }

        System.out.println(sum);
    }
}
