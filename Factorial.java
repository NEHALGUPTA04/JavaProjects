import java.util.Scanner;

public class Factorial {
    public static void main(String[] arg){
        int i,fact=1,num;
        System.out.println("enter the number : ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        for (i = 1; i <=num ; i++){
            fact = fact * i;
        }
        System.out.println("the factorial of the " + num +" is: "+fact);
        }
    }