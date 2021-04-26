import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER THE TEMPERATURE (fahrenheit) : ");
        double tempF=scanner.nextDouble();
        System.out.println("THE TEMPERATURE IN CELCIUS IS :" + ((tempF-32)*(0.55) )+"C");

        System.out.println("THE TEMPERATURE IN KELVIN IS :" + ((tempF-32)*(0.55)+273.15 )+"K");

    }
}
