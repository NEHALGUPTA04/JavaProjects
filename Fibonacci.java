
public class Fibonacci {
    public static void main(String arg[]) {
        int term1 = 0, term2 = 1;
        System.out.print("Fibonacci series of first 10 number is :\t");

        for (int i = 1; i <= 10; ++i) {

            System.out.print(term1 + "\t");
            int sum_Next_term = term1 + term2;
            term1 = term2;
            term2 = sum_Next_term;

        }
    }
}