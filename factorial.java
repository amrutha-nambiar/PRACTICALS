/*Define a class called A containg an instance variable y which denotes a integers and and define a
constant to initialise the instance  variable and method to find the factorial .
Class B contains main method and calls the above method and displays the factorial of the number .*/

import java.util.Scanner;

class A
{
    private int y;

    public A(int number)
    {
        this.y = number;
    }

    public int factorial()
    {
        int result = 1;
        for (int i = 1; i <= y; i++)
        {
            result *= i;
        }
        return result;
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

        System.out.println("The factorial of " + numberInput + " is: " + number.factorial());

        scanner.close();
    }
}
