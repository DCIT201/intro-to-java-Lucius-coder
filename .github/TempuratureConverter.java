import java.util.Scanner;

public class TemperatureConverter {
    public static void celsiusToFahrenheit() {
        try {

            System.out.println("Tempurature converter");
            System.out.println("1.Convert celsius to fahrenheit \n2.Convert fahrenheit to celsius");
            Scanner prompt = new Scanner(System.in);
            int value = prompt.nextInt();
            if (value == 1) {
                System.out.println("Enter temperature in celsius :");
                double celsius = prompt.nextDouble();
                double result = (celsius * 9 / 5) + 32;
                System.out.println(celsius + " celsius" + "is equal to " + result + " fahrenheit");
                prompt.close();
            } else if (value == 2) {
                System.out.println("Enter temperature in fahrenheit :");
                double fahrenheit = prompt.nextDouble();
                double result = (fahrenheit - 32) * 5 / 9;
                System.out.println(fahrenheit + " fahrenheit" + " is equal to " + result + " celsius");
                prompt.close();

            } else {
                System.out.println("invalid input");
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("tempurature conversion successful");
        }
    }

    public static void main(String[] args) {
        celsiusToFahrenheit();
    }
}

