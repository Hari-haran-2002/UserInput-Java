import java.util.Scanner;

public class UserInput {
    // Instance variables
    String userInputString;
    int userInputInt;
    float userInputFloat;
    double userInputDouble;

    // Method to get input from the user
    public void getInput() {
        Scanner scanner = new Scanner(System.in);

        // Getting string input
        System.out.print("Enter a string: ");
        userInputString = scanner.nextLine();

        // Getting int input
        System.out.print("Enter an integer: ");
        userInputInt = scanner.nextInt();

        // Getting float input
        System.out.print("Enter a float: ");
        userInputFloat = scanner.nextFloat();

        // Getting double input
        System.out.print("Enter a double: ");
        userInputDouble = scanner.nextDouble();

        scanner.close();
    }

    // Method to display the input values
    public void displayInput() {
        System.out.println("You entered:");
        System.out.println("String: " + userInputString);
        System.out.println("Integer: " + userInputInt);
        System.out.println("Float: " + userInputFloat);
        System.out.println("Double: " + userInputDouble);
    }

    public static void main(String[] args) {
        // Create an object of UserInput
        UserInput input = new UserInput();

        // Call methods to get and display input
        input.getInput();
        input.displayInput();
    }
}
