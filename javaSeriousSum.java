import java.util.Scanner;

public class javaSeriousSum {
    public static void main(String args []){
        double sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        for(float i=1; i<=n; i++){
            sum += 1/i;

        }
        System.out.println(sum);
    }
}
