import java.util.Arrays;

public class SortNumbers
{

   
    private static class SortHelper
    {

       
        public static void sortArray(int[] array)
        {
            Arrays.sort(array);
        }
    }

    public static void main(String[] args)
    {
        if (args.length == 0)
        {
            System.out.println("No numbers provided.");
            return;
        }

        int[] numbers = new int[args.length];

        for (int i = 0; i < args.length; i++)
        {
            numbers[i] = Integer.parseInt(args[i]);
        }

       
        SortHelper.sortArray(numbers);

        
        for (int number : numbers)
        {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
