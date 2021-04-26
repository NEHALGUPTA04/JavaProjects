import java.util.Scanner;

public class EvenOdd {
    public static void main(String[]arg){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();

        if(number%2 == 0)
        {
            System.out.println(number + "is even!!!");
        } else {
            System.out.println(number + "is odd !!!");
        }
    }
}
