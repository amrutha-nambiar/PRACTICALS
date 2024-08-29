/*Define a class called A containing an instance variable n which denotes integers 
and  define a constant to initialise the instance  variable and method to find the sum  1+ 1/2 + 2/3 + 3/4 + ....+ (n- 1)/n.
Class B contains main method and calls the above method and displays all the number 1 to n and print the result .*/

import java.util.Scanner;

class A 
{
    private int n;
    private static final int DEFAULT_N = 10;

    public A() 
    {
        this.n = DEFAULT_N;
    }

    public A(int number) 
    {
        this.n = number;
    }

    public double calculateSum() 
    {
        double sum = 1;
        for (int i = 1; i < n; i++) 
        {
            sum += (double) i / (i + 1);
        }
        return sum;
    }
}

public class B 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int numberInput = scanner.nextInt();

        A number = new A(numberInput);
        double result = number.calculateSum();

        System.out.println("Sum of the series is: " + result);
    }
}

