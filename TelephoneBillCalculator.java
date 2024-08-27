import java.util.Scanner;

public class TelephoneBillCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop to allow multiple entries
        while (true) {  // Loop starts here
            // Input the telephone number
            System.out.print("Enter the telephone number (or type 'exit' to quit): ");
            String telephoneNumber = scanner.nextLine();

            // Selection statement to check if user wants to exit
            if (telephoneNumber.equals("exit")) {  // Check if input is exactly "exit"
                break;  // Exit the loop
            }

            // Input the number of calls
            System.out.print("Enter the number of calls made: ");
            int numberOfCalls = scanner.nextInt();

            // Calculate the bill amount
            double billAmount = calculateBill(numberOfCalls);

            // Display the bill amount
            System.out.println("Telephone Number: " + telephoneNumber);
            System.out.println("Number of Calls: " + numberOfCalls);
            System.out.println("Total Bill Amount: Rs " + billAmount);

            // Clear the newline character from the buffer
            scanner.nextLine(); // This line is necessary to handle the newline character after entering the number of calls
        }

        System.out.println("Program exited.");
        scanner.close();
    }

    // Method to calculate the bill amount
    private static double calculateBill(int numberOfCalls) {
        double fixedRent = 400;
        int freeCalls = 50;
        double chargePerExcessCall = 0.80;
        double totalBillAmount = fixedRent;

        // Selection statement to check if there are excess calls
        if (numberOfCalls > freeCalls) {  // Selection statement 2
            int excessCalls = numberOfCalls - freeCalls;
            totalBillAmount += excessCalls * chargePerExcessCall;
        }

        return totalBillAmount;
    }
}
