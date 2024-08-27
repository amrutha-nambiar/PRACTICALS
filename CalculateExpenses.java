public class Discount {

    // Inner class for calculating the discount
    private static class DiscountCalculator {
        
        // Method to calculate the discounted amount
        public static double calculateDiscount(double amount) {
            if (amount > 1000) {
                return amount * 0.9; // 10% discount
            }
            return amount; // No discount
        }
    }

    public static void main(String[] args) {
        // Ensure at least one command-line argument is provided
        if (args.length < 1) {
            System.out.println("Please provide the amount as a command-line argument.");
            return;
        }

        try {
            // Convert the command-line argument to a double
            double amount = Double.parseDouble(args[0]);

            // Calculate the discounted amount using DiscountCalculator
            double discountedAmount = DiscountCalculator.calculateDiscount(amount);

            // Display the result
            if (amount > 1000) {
                System.out.println("Discounted amount: $" + discountedAmount);
            } else {
                System.out.println("No Discount provided");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a valid number.");
        }
    }
}
