public class ArraySum
{

    public static void main(String[] args)
    {

        int[][] array1 = new int[2][3];
        int[][] array2 = new int[2][3];
        int[][] sumArray = new int[2][3];

        int index = 0;

        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                array1[i][j] = Integer.parseInt(args[index++]);
            }
        }

        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                array2[i][j] = Integer.parseInt(args[index++]);
            }
        }

        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                sumArray[i][j] = array1[i][j] + array2[i][j];
            }
        }

        System.out.println("Array 1:");
        printArray(array1);

        System.out.println("Array 2:");
        printArray(array2);

        System.out.println("Sum of Array 1 and Array 2:");
        printArray(sumArray);
    }

    private static void printArray(int[][] array)
    {
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
