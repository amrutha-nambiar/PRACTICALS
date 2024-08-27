// Class Complete1 containing instance variables of String and byte type
class Complete1 {
    // Instance variables
    String text;
    byte number;

    // Constructor to initialize instance variables
    public Complete1(String textValue, byte numberValue) {
        text = textValue;
        number = numberValue;
    }

    // Method to display instance variables
    public void display() {
        System.out.println("String value: " + text);
        System.out.println("Byte value: " + number);
    }
}

// Class Complete2 containing methods to find the square and cube of a number, and to add two numbers
class Complete2 {
    // Method to find the square of an integer
    public int power(int number) {
        return number * number;
    }

    // Method to find the cube of an integer
    public int cube(int number) {
        return number * number * number;
    }

    // Method to add two integers
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}

// Class Complete3 containing instance variables x and y of integer type, and methods to display and subtract
class Complete3 {
    // Instance variables
    int x;
    int y;

    // Constructor to initialize instance variables
    public Complete3(int xValue, int yValue) {
        x = xValue;
        y = yValue;
    }

    // Method to display the values of x and y
    public void display() {
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
    }

    // Method to subtract y from x
    public int subtract() {
        return x - y;
    }
}

// Main class CompleteDemo to test the functionality of the above classes
public class CompleteDemo {
    public static void main(String[] args) {
        // Creating an object of Complete1
        Complete1 complete1 = new Complete1("Hello", (byte) 25);
        complete1.display();

        // Creating an object of Complete2
        Complete2 complete2 = new Complete2();
        int number = 5;
        System.out.println("Square of " + number + ": " + complete2.power(number));
        System.out.println("Cube of " + number + ": " + complete2.cube(number));
        System.out.println("Sum of 10 and 15: " + complete2.add(10, 15));

        // Creating an object of Complete3
        Complete3 complete3 = new Complete3(20, 10);
        complete3.display();
        System.out.println("Difference between x and y: " + complete3.subtract());
    }
}
