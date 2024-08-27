public class MatrixDisplay
{

    private static void displayMatrix(int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args)
    {
     
        if (args.length != 9)
        {
            System.out.println("Please provide 9 integers");
            return;
        } 
        int[][] matrix = new int[3][3];
        int index = 0;
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                matrix[i][j] = Integer.parseInt(args[index]);
                index++;
            }
        }
        System.out.println("3x3 Matrix:");
        displayMatrix(matrix);
    }
}
