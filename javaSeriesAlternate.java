import java.util.Scanner;

public class javaSeriesAlternate {
    public static void main(String args []){
        double sum=0;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

            for(float i = 1; i<=n; i++){
                if(1%2==0){
                    sum -= 1/i;
                }
                else{
                    sum += 1/i;
                }

        }
        System.out.println(sum);



    }
}
