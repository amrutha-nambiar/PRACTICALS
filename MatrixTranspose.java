//To initialize a 2D array of order 4×3 and to find its transpose and program should display.



 public class MatrixTranspose 
{
	public static void main(String[] args) 
	{
        int[][] matrix =
             {
            	{7, 6, 31},
            	{9, 6, 21},
            	{4, 1, 11},
            	{31, 10, 14}
             };

        int[][] transpose = getTranspose(matrix);

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        System.out.println("Transpose Matrix:");
        printMatrix(transpose);

        }

        public static int[][] getTranspose(int[][] matrix) 
	{
       		 int rows = matrix.length;
       		 int cols = matrix[0].length;
        	 int[][] transpose = new int[cols][rows];

        	for (int i = 0; i < rows; i++)
		 {
            		for (int j = 0; j < cols; j++) 
		{
                	transpose[j][i] = matrix[i][j];
       		 }

       		 }

        return transpose;
      }

    	public static void printMatrix(int[][] matrix) 
	{
       		 for (int[] row : matrix) 
		{
            		for (int element : row) 
		{
                	System.out.print(element + " ");
                }
            		System.out.println();
      	  	 }

   		 }this