package java_Console_Projects;

import java.util.Scanner;

public class TemperatureConverter {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Temperature Converter!");

        while (true) {
            try {
                // Prompt the user for temperature value
                System.out.print("\nEnter the temperature value to convert: ");
                double temperature = Double.parseDouble(scanner.nextLine());

                // Prompt the user for the source scale
                System.out.println("Choose the source temperature scale:");
                System.out.println("1. Celsius (C)");
                System.out.println("2. Fahrenheit (F)");
                System.out.println("3. Kelvin (K)");
                System.out.print("Enter your choice (1-3): ");
                String sourceScale = scanner.nextLine();

                // Prompt the user for the target scale
                System.out.println("Choose the target temperature scale:");
                System.out.println("1. Celsius (C)");
                System.out.println("2. Fahrenheit (F)");
                System.out.println("3. Kelvin (K)");
                System.out.print("Enter your choice (1-3): ");
                String targetScale = scanner.nextLine();

                double convertedTemperature;

                // Perform the conversion based on user choices
                if (sourceScale.equals("1") && targetScale.equals("2")) { // Celsius to Fahrenheit
                    convertedTemperature = (temperature * 9/5) + 32;
                    System.out.printf("Converted Temperature: %.2f°F%n", convertedTemperature);
                } else if (sourceScale.equals("1") && targetScale.equals("3")) { // Celsius to Kelvin
                    convertedTemperature = temperature + 273.15;
                    System.out.printf("Converted Temperature: %.2fK%n", convertedTemperature);
                } else if (sourceScale.equals("2") && targetScale.equals("1")) { // Fahrenheit to Celsius
                    convertedTemperature = (temperature - 32) * 5/9;
                    System.out.printf("Converted Temperature: %.2f°C%n", convertedTemperature);
                } else if (sourceScale.equals("2") && targetScale.equals("3")) { // Fahrenheit to Kelvin
                    convertedTemperature = (temperature - 32) * 5/9 + 273.15;
                    System.out.printf("Converted Temperature: %.2fK%n", convertedTemperature);
                } else if (sourceScale.equals("3") && targetScale.equals("1")) { // Kelvin to Celsius
                    convertedTemperature = temperature - 273.15;
                    System.out.printf("Converted Temperature: %.2f°C%n", convertedTemperature);
                } else if (sourceScale.equals("3") && targetScale.equals("2")) { // Kelvin to Fahrenheit
                    convertedTemperature = (temperature - 273.15) * 9/5 + 32;
                    System.out.printf("Converted Temperature: %.2f°F%n", convertedTemperature);
                } else if (sourceScale.equals(targetScale)) { // Same scale
                    System.out.printf("Converted Temperature: %.2f (No change)%n", temperature);
                } else {
                    System.out.println("Invalid choice for source or target scale. Please try again.");
                }

                // Ask user if they want to perform another conversion
                System.out.print("\nDo you want to perform another conversion? (yes/no): ");
                String continueChoice = scanner.nextLine().trim().toLowerCase();
                if (!continueChoice.equals("yes")) {
                    System.out.println("Exiting the Temperature Converter. Goodbye!");
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid numeric temperature value.");
            }
        }

        scanner.close();
    }
}
