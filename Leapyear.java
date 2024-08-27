/*Define a class called A containg an instance variable y which denotes a year and and define a constant to initialise the instance  variable and 
  method to check  whether it is a leap year or not.
  Define a class called A containg an instance variable y which denotes a year and and define a constant to initialise the instance  variable and method to check  whether it is a leap year or not.
Class B contains main method and calls the above method and displays whether y is a leap year or not a leap year .
*/

import java.util.Scanner;

class A
{
    private int y;

    public A(int year)
    {
        this.y = year;
    }

    public boolean isLeapYear()
    {
        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

public class B
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int yearInput = scanner.nextInt();

        A year = new A(yearInput);

        if (year.isLeapYear())
        {
            System.out.println(yearInput + " is a leap year.");
        }
        else
        {
            System.out.println(yearInput + " is not a leap year.");
        }

        scanner.close();
    }
}
