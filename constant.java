/*Define a class called A contaning an instance variable y which denotes a integers 
and  define a constant to initialise the instance  variable and method to check whether it is divisible by 6 or 8 or not both.
Class B contains main method and calls the above method and displays all the number 1 to y which is divisible by 6 or 8 or not both.*/

import java.util.Scanner;

class A 
{
    private int y;
    private static final int CONSTANT = 10;

    public A() 
    {
        this.y = CONSTANT;
    }

    public A(int number) 
    {
        this.y = number;
    }

    public boolean isDivisibleBy6Or8(int number) 
    {
        return (number % 6 == 0) || (number % 8 == 0);
    }

    public boolean isDivisibleByBoth6And8(int number) 
    {
        return (number % 6 == 0) && (number % 8 == 0);
    }

    public void displayDivisibility() 
    {
        System.out.println("Numbers from 1 to " + y + " based on divisibility:");
        System.out.println("Divisible by 6 or 8:");
        for (int i = 1; i <= y; i++) 
        {
            if (isDivisibleBy6Or8(i)) 
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("Divisible by both 6 and 8:");
        for (int i = 1; i <= y; i++) 
        {
            if (isDivisibleByBoth6And8(i)) 
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("Not divisible by either 6 or 8:");
        for (int i = 1; i <= y; i++) 
        {
            if (!isDivisibleBy6Or8(i)) 
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

public class B 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int numberInput = scanner.nextInt();

        A number = new A(numberInput);
        number.displayDivisibility();
    }
}
