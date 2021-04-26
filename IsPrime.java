import java.util.Scanner;

public class IsPrime {
    public static void main(String[] arg) {
        int i, isPrime = 0,count=0;
        System.out.println("enter the number : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num == 0 || num == 1) {
            System.out.println(num + " is not a prime number");
        } else {
            for (i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not a prime number");
                    isPrime = 1;
                    break;
                }
            }
            if (isPrime == 0) {
                System.out.println(num + " is prime number");
            }
        }
    }
}