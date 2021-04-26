
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String arg []){
        int num;
        int[] arr = new int[50];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the decimal number : ");
        num = scanner.nextInt();

        int i = 0;
        while(num>0) {
            arr[i++] = num % 2;
            num = num / 2;
        }
        System.out.println("Binary number will be : ");
        for(int j=i-1;j>=0;j--){
            System.out.print(arr[j]);
        }
        }
    }