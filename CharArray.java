//Write a java program to search a particular character of an array.

import java.util.Scanner;

public class CharArray 
{
	static class Character 
	{
         private final char value;

         public Character(char value) 
	 {
            this.value = value;
         }

        public char getValue() 
	{
            return value;
        }
}

        static class ArraySearch 
	{
        	public void searchCharacter(char[] array, char searchChar) 
		{
           	 	for (int i = 0; i < array.length; i++) 
	     	{
                	if (array[i] == searchChar) 
		 {
                    	System.out.println("Character '" + searchChar + "' found at index: " + i);
                    	return;
                }

               }
            	  	System.out.println("Character '" + searchChar + "' not found in the array.");
              }
    }

   		 public static void main(String[] args) 
		 {
        		 Scanner scanner = new Scanner(System.in);
       			 char[] charArray = {'l', 'o', 'k', 'w', 'p', 'q', 'r', 's', 'i', 't'};
        		 ArraySearch searchService = new ArraySearch();

        		System.out.print("Enter a character to search for: ");
        		char searchChar = scanner.next().charAt(0);
	
        		searchService.searchCharacter(charArray, searchChar);
    	        }
}