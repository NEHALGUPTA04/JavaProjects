import java.util.Scanner;

public class javaXpowerY {
    public static void main(String args []){
        int pow = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X : ");
        int X = sc.nextInt();
        System.out.println("Enter Y : ");

        int Y = sc.nextInt();
        for(int i = 1;i <= Y;i++){
             pow *= X;
        }
        System.out.println(pow);


    }
}
