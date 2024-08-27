public class Discount {

    // Method to calculate the discounted amount
    private static double calculateDiscount(double amount) {
        if (amount > 1000) {
            return amount * 0.9; // 10% discount
        }
        return amount; // No discount
    }

    public static void main(String[] args) {
        // Ensure at least one command-line argument is provided
        if (args.length == 0) {
            System.out.println("Please provide amounts as command-line arguments.");
            return;
        }

        // Loop through each command-line argument using traditional for loop
        for (int i = 0; i < args.length; i++) {
            // Convert the command-line argument to a double
            double amount = Double.parseDouble(args[i]);

            // Calculate the discounted amount
            double discountedAmount = calculateDiscount(amount);

            // Display the result
            if (amount > 1000) {
                System.out.println("Amount: $" + amount + " -> Discounted amount: $" + discountedAmount);
            } else {
                System.out.println("Amount: $" + amount + " -> No Discount provided");
            }
        }
    }
}
