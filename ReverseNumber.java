import java.util.Scanner;

public class ReverseNumber{
    public static void main(String args[]){
        int reverse = 0,remainder,number;
        System.out.println("Enter the number : ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        while(number != 0){      //for(;number != 0;){
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("reversed number is : " + reverse);
    }

}