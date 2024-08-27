//Define the following classes:

    //- Class Complete-1: Contains instance variables of string and integer type.
    //Class Complete-2: Contains:
    //- A Power method to find the square and cube of an integer type number.
    //- An Add method to find the sum of two integer numbers.
    //- Class Complete-3: Contains:
   // - Instance variables of integer type x and y.
    //- A method to display the values of x and y.
    //- A Subtract method to take the difference of x and y.



class Complete1 
{
    String text;
    byte number;

    public Complete1(String textValue, byte numberValue) 
    {
        text = textValue;
        number = numberValue;
    }

    public void display() 
    {
        System.out.println("String value: " + text);
        System.out.println("Byte value: " + number);
    }
}

class Complete2 
{
    public int power(int number) 
    {
        return number * number;
    }

    public int cube(int number) 
    {
        return number * number * number;
    }

    public int add(int num1, int num2) 
    {
        return num1 + num2;
    }
}

class Complete3 
{
    int x;
    int y;

    public Complete3(int xValue, int yValue) 
    {
        x = xValue;
        y = yValue;
    }

    public void display() 
    {
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
    }

    public int subtract() 
    {
        return x - y;
    }
}

public class CompleteDemo 
{
    public static void main(String[] args) 
    {
        Complete1 complete1 = new Complete1("Hello", (byte) 25);
        complete1.display();

        Complete2 complete2 = new Complete2();
        int number = 5;
        System.out.println("Square of " + number + ": " + complete2.power(number));
        System.out.println("Cube of " + number + ": " + complete2.cube(number));
        System.out.println("Sum of 10 and 15: " + complete2.add(10, 15));

        Complete3 complete3 = new Complete3(20, 10);
        complete3.display();
        System.out.println("Difference between x and y: " + complete3.subtract());
    }
}
