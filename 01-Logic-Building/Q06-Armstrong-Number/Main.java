import java.util.Scanner;

public class Main{
// public static void main(String[] args) {
    
    
//     //brute force approach

//     int n = 153;
//     String str = String.valueOf(n);
//     int power = str.length();
//     int sum=0;

//     for (int i=0; i<str.length(); i++){
//         int digit = str.charAt(i) - '0';
//         sum += Math.pow(digit, power);
//     };
//     System.out.println(sum == n);
// }


    

    //optimized approach -- mathematical approach

    public static boolean isArmstrong(int n){
        if(n<0) return false;
        int original = n;
        int temp = n;
        int count = 0;

        //count digits
        do{
            count++;
            temp=temp/10;
        }while(temp>0);

        temp=n;
        long sum=0;
        //calcultare armstronig sum
        while(temp>0){
            int digit = temp%10;
            long power = 1;
            for(int i=0; i<count; i++){
                power *= digit;
            }
            sum += power;
            temp=temp/10;
        }
        return sum == original;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter a number: ");
            int n = sc.nextInt();
            System.out.println(isArmstrong(n));
            sc.close();
        
    }


}
