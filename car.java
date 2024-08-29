/* Write a java program to define following classes. define car as class with instance variable color and body .
initalize as blue and wagon. define car as default constructor and another constructor with parameter color and body. 
display is the method that display the color and body except for blue color otherwise display car is blue. 
define CarDemo that contains main method . create an instanse of car class with color as red and body color as watertank .*/

class Car
{
    String color;
    String body;

    Car()
    {
        color = "blue";
        body = "wagon";
    }

    Car(String color, String body)
    {
        this.color = color;
        this.body = body;
    }

    void display()
    {
        if (!color.equals("blue"))
        {
            System.out.println("Color: " + color);
            System.out.println("Body: " + body);
        }
        else
        {
            System.out.println("Car is blue.");
        }
    }
}

class CarDemo
{
    public static void main(String[] args)
    {
        Car myCar = new Car("red", "watertank");
        myCar.display();
    }
}
