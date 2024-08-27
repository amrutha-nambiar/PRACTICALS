//Write a java program 2×2 find their products


import java.util.Scanner;

public class Multiplication 
{
	public static void main(String[] args) 
	{

        	Scanner scanner = new Scanner(System.in);

       		 System.out.print("Enter the first number: ");
        	 int n1 = scanner.nextInt();

       		 System.out.print("Enter the second number: ");
        	 int n2 = scanner.nextInt();

       		 Multiplication2 multiplication = new Multiplication2(n1, n2);
       		 int product = multiplication.getProduct();

        	System.out.println("The product of " + n1 + " and " + n2 + " is: " + product);

        	scanner.close();

    }

}

	class Multiplication2 
	{
    		private final int n1;
    		private final int n2;

    	public Multiplication2(int n1, int n2)
	 {
       		 this.n1 = n1;
        	 this.n2 = n2;
         }

    	public int getProduct() 
	{

        return n1 * n2;
        }


