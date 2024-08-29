/*Define a class called A contaning an instance variable n which denotes
a number and  define a constant to initialise the instance  variable and method to find the sum  1+ 1/2 + 1/3 + 1/4 + ....+ 1/n.
Class B contains main method and calls the above method and displays to  print the sum as  result .take input using scanner class */

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
        double sum = 0.0;
        for (int i = 1; i <= n; i++) 
        {
            sum += (double) 1 / i;
        }
        return sum;
    }
}

public class B 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int numberInput = scanner.nextInt();

        A a = new A(numberInput);
        double result = a.calculateSum();

        System.out.println("Sum of the series " + numberInput + " is: " + result);
    }
}
