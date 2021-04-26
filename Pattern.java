import java.util.Scanner;

public class Pattern {
    public static void main(String[] arg){
        System.out.println("enter the number of rows u want to pyramid : ");
        Scanner scanner = new Scanner(System.in);
        int rows=scanner.nextInt();

        for(int i =1 ; i<= rows; ++i ){
            for(int j = 1; j<=i; ++j ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}