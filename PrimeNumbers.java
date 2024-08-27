//Write a Java program to find the prime numbers from 1 to n, where n is passed using the command-line argument (CLA).

public class PrimeNumbers
{

    private static boolean isPrime(int num)
    {
        if (num <= 1)
        {
            return false;
        }
        if (num == 2)
        {
            return true;
        }
        if (num % 2 == 0)
        {
            return false;
        }
        for (int i = 3; i * i <= num; i += 2)
        {
            if (num % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    private static void printPrimesUpTo(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            if (isPrime(i))
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        if (args.length != 1)
        {
            System.out.println("Please provide a single positive integer as a command-line argument.");
            return;
        }

        int n = Integer.parseInt(args[0]);
        printPrimesUpTo(n);
    }
}
