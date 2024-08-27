public class PrimeNumbers {

    // Method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to print all prime numbers up to n
    private static void printPrimesUpTo(int n) {
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Ensure a command-line argument is provided
        if (args.length != 1) {
            System.out.println("Please provide a single positive integer as a command-line argument.");
            return;
        }

        // Convert the command-line argument to an integer
        int n = Integer.parseInt(args[0]);

        // Print all prime numbers up to n
        printPrimesUpTo(n);
    }
}
