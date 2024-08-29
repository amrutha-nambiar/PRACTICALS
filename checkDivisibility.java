/*Define a class called A containg an instance variable y which denotes a integers and 
define a constant to initialise the instance  variable and method to check whether it is divisible by 4 or 6.
Class B contains main method and calls the above method and displays the result.*/


import java.util.Scanner;

class A
{
    private int y;

    public A(int number)
    {
        this.y = number;
    }

    public String checkDivisibility()
    {
        boolean divisibleBy4 = (y % 4 == 0);
        boolean divisibleBy6 = (y % 6 == 0);
        
        if (divisibleBy4 && divisibleBy6)
        {
            return y + " is divisible by both 4 and 6.";
        }
        else if (divisibleBy4)
        {
            return y + " is divisible by 4 but not by 6.";
        }
        else if (divisibleBy6)
        {
            return y + " is divisible by 6 but not by 4.";
        }
        else
        {
            return y + " is not divisible by 4 or 6.";
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

        System.out.println(number.checkDivisibility());
        
        scanner.close();
    }
}
