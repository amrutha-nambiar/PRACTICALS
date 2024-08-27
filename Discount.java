//Write a Java program to calculate expenses with a discount of 10% if the total quantity purchased is more than 1000.

public class Discount
{

    private static double calculateDiscount(double amount)
    {
        if (amount > 1000)
        {
            return amount * 0.9;
        }
        return amount;
    }

    public static void main(String[] args)
    {
        if (args.length == 0)
        {
            System.out.println("Please provide amounts as command-line arguments.");
            return;
        }

        for (int i = 0; i < args.length; i++)
        {
            double amount = Double.parseDouble(args[i]);
            double discountedAmount = calculateDiscount(amount);

            if (amount > 1000)
            {
                System.out.println("Amount: $" + amount + " -> Discounted amount: $" + discountedAmount);
            }
            else
            {
                System.out.println("Amount: $" + amount + " -> No Discount provided");
            }
        }
    }
}
