import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String args[]){
        int i;
        int arr[] = {1,2,3,4,5};
        try{
            System.out.println("Nested Try Block");
            int x = Integer.parseInt("123");
            System.out.println(x+1);
            System.out.println(x);
            try{
                for(i = 0;i<=arr.length+5;i++)
                    System.out.println(arr[i]);
            }
            catch(ArrayIndexOutOfBoundsException aiob){
                System.out.println("Multiple Catch Block");
                System.out.println(aiob);
            }
        }
        catch(NumberFormatException nfe){
            System.out.println(nfe);
        }
    }
}
