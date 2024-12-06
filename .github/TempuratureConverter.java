import java.util.Scanner;

public class TemperatureConverter {

    public static void celsiusToFahrenheit() {
        try {
            // Display program title and options to the user
            System.out.println("Temperature Converter");
            System.out.println("1. Convert Celsius to Fahrenheit \n2. Convert Fahrenheit to Celsius");

            // Create a Scanner object to read user input
            Scanner prompt = new Scanner(System.in);

            // Read the user's choice (1 or 2)
            int value = prompt.nextInt();

            if (value == 1) {
                System.out.println("Enter temperature in Celsius:");
                double celsius = prompt.nextDouble(); // Read the Celsius value
                double result = (celsius * 9 / 5) + 32; // Conversion formula
                System.out.println(celsius + " Celsius is equal to " + result + " Fahrenheit");
                prompt.close();

                // Handle Fahrenheit to Celsius conversion
            } else if (value == 2) {
                System.out.println("Enter temperature in Fahrenheit:");
                double fahrenheit = prompt.nextDouble(); // Read the Fahrenheit value
                double result = (fahrenheit - 32) * 5 / 9; // Conversion formula
                System.out.println(fahrenheit + " Fahrenheit is equal to " + result + " Celsius");
                prompt.close();

                // Handle invalid input
            } else {
                System.out.println("Invalid input"); // Inform the user of an invalid choice
            }

        } catch (ArithmeticException e) {
            System.out.println(e); // Print the exception detailsimport java.util.Scanner; // Import the Scanner class for user input

// Main class for the Temperature Converter
            public class TemperatureConverter {

                // Method to convert temperatures between Celsius and Fahrenheit
                public static void celsiusToFahrenheit() {
                    try {
                        // Display program title and options to the user
                        System.out.println("Temperature Converter");
                        System.out.println("1. Convert Celsius to Fahrenheit \n2. Convert Fahrenheit to Celsius");

                        // Create a Scanner object to read user input
                        Scanner prompt = new Scanner(System.in);

                        // Read the user's choice (1 or 2)
                        int value = prompt.nextInt();

                        // Handle Celsius to Fahrenheit conversion
                        if (value == 1) {
                            System.out.println("Enter temperature in Celsius:");
                            double celsius = prompt.nextDouble(); // Read the Celsius value
                            double result = (celsius * 9 / 5) + 32; // Conversion formula
                            System.out.println(celsius + " Celsius is equal to " + result + " Fahrenheit");
                            prompt.close(); // Close the Scanner to release resources

                            // Handle Fahrenheit to Celsius conversion
                        } else if (value == 2) {
                            System.out.println("Enter temperature in Fahrenheit:");
                            double fahrenheit = prompt.nextDouble(); // Read the Fahrenheit value
                            double result = (fahrenheit - 32) * 5 / 9; // Conversion formula
                            System.out.println(fahrenheit + " Fahrenheit is equal to " + result + " Celsius");
                            prompt.close(); // Close the Scanner to release resources

                            // Handle invalid input
                        } else {
                            System.out.println("Invalid input"); // Inform the user of an invalid choice
                        }

                        // Catch and handle any ArithmeticException that might occur
                    } catch (ArithmeticException e) {
                        System.out.println(e); // Print the exception details

                        // Execute code in the `finally` block regardless of what happens in `try`
                    } finally {
                        System.out.println("Temperature conversion successful"); // Inform user of successful execution
                    }
                }

                // Main method to run the program
                public static void main(String[] args) {
                    celsiusToFahrenheit(); // Call the temperature conversion method
                }
            }


        } finally {
            System.out.println("Temperature conversion successful"); // Inform user of successful execution
        }
    }

    public static void main(String[] args) {
        celsiusToFahrenheit();
    }
}
