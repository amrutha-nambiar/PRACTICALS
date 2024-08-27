

- Equilateral
- Isosceles
- Scalene
public class TriangleType2
{

    private static class TriangleUtils
    {

        private static boolean isValidTriangle(int a, int b, int c)
        {
            return (a + b > c) && (a + c > b) && (b + c > a);
        }

        private static String determineTriangleType(int a, int b, int c)
        {
            if (a == b && b == c)
            {
                return "equilateral";
            }
            else if (a == b || b == c || a == c)
            {
                return "isosceles";
            }
            else
            {
                return "scalene";
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
