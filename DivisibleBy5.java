/*Define a class called A containg an instance variable y which denotes a number and 
define a constant to initialise the instance  variable and method to check  whether the number is divisible by 5 or not.*/


import java.util.Scanner;

class A
{
    private int y;

    public A(int number)
    {
        this.y = number;
    }

    public boolean isDivisibleBy5()
    {
        return y % 5 == 0;
    }

    public int getY()
    {
        return y;
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

        if (number.isDivisibleBy5())
        {
            System.out.println(number.getY() + " is divisible by 5.");
        }
        else
        {
            System.out.println(number.getY() + " is not divisible by 5.");
        }

        scanner.close();
    }
}
