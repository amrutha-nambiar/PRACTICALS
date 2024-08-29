/*Write a java program consisting of the following classes. A class numbers stores 9 cards number from 2 to 10 
using Nine_no method card face cards arestored using instance variable .
A method  could determine the card from the suit with the number and the color of the card . 
there is another method called face to find the face card from suit called color. The main method is written in the class called NumDemo . 
create an object of playing card with suit name and number or suit name and face card*/

class Numbers
{
    private int[] cardNumbers;

    public Numbers()
    {
        cardNumbers = new int[9];
        Nine_no();
    }

    public void Nine_no()
    {
        for (int i = 0; i < 9; i++)
        {
            cardNumbers[i] = i + 2;
        }
    }

    public void determineCard(String suit, int number)
    {
        String color = (suit.equals("Hearts") || suit.equals("Diamonds")) ? "Red" : "Black";
        if (number >= 2 && number <= 10)
        {
            System.out.println("Card: " + number + " of " + suit + " (" + color + ")");
        }
        else
        {
            System.out.println("Invalid card number.");
        }
    }

    public void face(String suit, String faceCard)
    {
        String color = (suit.equals("Hearts") || suit.equals("Diamonds")) ? "Red" : "Black";
        if (faceCard.equalsIgnoreCase("Jack") || faceCard.equalsIgnoreCase("Queen")
                || faceCard.equalsIgnoreCase("King") || faceCard.equalsIgnoreCase("Ace"))
        {
            System.out.println("Face Card: " + faceCard + " of " + suit + " (" + color + ")");
        }
        else
        {
            System.out.println("Invalid face card.");
        }
    }
}

public class NumDemo
{
    public static void main(String[] args)
    {
        Numbers playingCard = new Numbers();

        playingCard.determineCard("Hearts", 7);

        playingCard.face("Spades", "Queen");
    }
}

