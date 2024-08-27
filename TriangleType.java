public class TriangleType {

    // Static inner class for triangle-related calculations
    private static class TriangleUtils {

        // Method to check if the sides can form a triangle
        private static boolean isValidTriangle(int a, int b, int c) {
            return (a + b > c) && (a + c > b) && (b + c > a);
        }

        // Method to determine the type of triangle
        private static String determineTriangleType(int a, int b, int c) {
            int x = a, y = b, z = c;

            // Find the longest side
            if (a >= b && a >= c) {
                x = b;
                y = c;
                z = a;
            } else if (b >= a && b >= c) {
                x = a;
                y = c;
                z = b;
            } else {
                x = a;
                y = b;
                z = c;
            }

            // Calculate squares of the sides
            int x2 = x * x;
            int y2 = y * y;
            int z2 = z * z;

            // Determine the type of triangle
            if (x2 + y2 == z2) {
                return "right";
            } else if (x2 + y2 < z2) {
                return "obtuse";
            } else {
                return "acute";
            }
        }
    }

    public static void main(String[] args) {
        // Ensure at least three command-line arguments are provided
        if (args.length < 3) {
            System.out.println("Please provide three positive integers as command-line arguments.");
            return;
        }

        // Convert command-line arguments to integers
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        // Check if the sides can form a triangle
        if (TriangleUtils.isValidTriangle(a, b, c)) {
            // Determine the type of triangle
            String triangleType = TriangleUtils.determineTriangleType(a, b, c);
            System.out.println("The sides form a " + triangleType + " triangle.");
        } else {
            System.out.println("The sides do not form a valid triangle.");
        }
    }
}
