public class Main {

    //brute force with string builder

    // public static void main(String[] args) {
    //     int n =121;
    //     String original = String.valueOf(n);
    //     String reversed = new StringBuilder(original).reverse().toString();
    //     System.out.println(original.equals(reversed));
    // }

    //mathematical approach

    public static int reverse(int n) {
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return reversed;
    }

    public static void main(String[] args) {
        int n =1231;
        System.out.println(n == reverse(n));
    }
}