/*Write a Java program to
 Input the telephone number and number of calls using command-line arguments (CLA)
- Calculate and display the total bill with a fixed rent of Rs. 200 and each call charged at Rs. 0.80
- The first 50 calls are free*/
import java.util.Scanner;

public class TelephoneBillCalculator
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.print("Enter the telephone number (or type 'exit' to quit): ");
            String telephoneNumber = scanner.nextLine();

            if (telephoneNumber.equals("exit"))
            {
                break;
            }

            System.out.print("Enter the number of calls made: ");
            int numberOfCalls = scanner.nextInt();

            double billAmount = calculateBill(numberOfCalls);

            System.out.println("Telephone Number: " + telephoneNumber);
            System.out.println("Number of Calls: " + numberOfCalls);
            System.out.println("Total Bill Amount: Rs " + billAmount);

            scanner.nextLine();
        }

        System.out.println("Program exited.");
        scanner.close();
    }

    private static double calculateBill(int numberOfCalls)
    {
        double fixedRent = 400;
        int freeCalls = 50;
        double chargePerExcessCall = 0.80;
        double totalBillAmount = fixedRent;

        if (numberOfCalls > freeCalls)
        {
            int excessCalls = numberOfCalls - freeCalls;
            totalBillAmount += excessCalls * chargePerExcessCall;
        }

        return totalBillAmount;
    }
}
