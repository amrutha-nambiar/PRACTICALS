/*Write a Java program to determine whether three given positive integer (a, b, and c) can form the sides of a triangle. 
    If yes,determine the type of triangle (right-angled, acute, or obtuse).*/

public class TriangleType
{

    private static class TriangleUtils
    {

        private static boolean isValidTriangle(int a, int b, int c)
        {
            return (a + b > c) && (a + c > b) && (b + c > a);
        }

        private static String determineTriangleType(int a, int b, int c)
        {
            int x = a, y = b, z = c;

            if (a >= b && a >= c)
            {
                x = b;
                y = c;
                z = a;
            }
            else if (b >= a && b >= c)
            {
                x = a;
                y = c;
                z = b;
            }
            else
            {
                x = a;
                y = b;
                z = c;
            }

            int x2 = x * x;
            int y2 = y * y;
            int z2 = z * z;

            if (x2 + y2 == z2)
            {
                return "right";
            }
            else if (x2 + y2 < z2)
            {
                return "obtuse";
            }
            else
            {
                return "acute";
            }
        }
    }

    public static void main(String[] args)
    {
        if (args.length < 3)
        {
            System.out.println("Please provide three positive integers as command-line arguments.");
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (TriangleUtils.isValidTriangle(a, b, c))
        {
            String triangleType = TriangleUtils.determineTriangleType(a, b, c);
            System.out.println("The sides form a " + triangleType + " triangle.");
        }
        else
        {
            System.out.println("The sides do not form a valid triangle.");
        }
    }
}
