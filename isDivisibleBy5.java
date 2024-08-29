/*Define a class called A containing an instance variable y which denotes integers and
define a constant to initialise the instance  variable and method to check whether it is divisible by 5.
Class B contains the main method and calls the above 
method and displays all the number 1 to y which is divisible by 5.*/
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

    public boolean isDivisibleBy5(int number) 
    {
        return number % 5 == 0;
    }

    public void displayDivisibleBy5() 
    {
        System.out.println("Numbers from 1 to " + y + " that are divisible by 5:");
        for (int i = 1; i <= y; i++) 
        {
            if (isDivisibleBy5(i)) 
            {
                System.out.println(i);
            }
        }
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
        number.displayDivisibleBy5();
    }
}

