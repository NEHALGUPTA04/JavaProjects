import java.util.Scanner;

public class DayAsInteger {
    public static void main(String[] args){
        int Days,No_Of_Weeks,No_Of_Months,No_Of_Years;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter no. of days : ");
        Days = sc.nextInt();

        if(Days == 0){
            System.out.println("zero days");
        }
        else{
            No_Of_Years = Days/365;
            No_Of_Months = (Days % 365)/30;
            No_Of_Weeks = (Days % 365) - (No_Of_Months * 30);
            System.out.println( No_Of_Years + " years, " + No_Of_Months + " months and "+ No_Of_Weeks + " days");


        }

    }

}
