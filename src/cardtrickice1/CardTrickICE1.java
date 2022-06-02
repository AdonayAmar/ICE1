/*
 * Modifier: Adonay Amar
 */
package cardtrickice1;

import java.util.Scanner;
import java.util.Random;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author sivagamasrinivasan,May 23rd
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Random rand = new Random();
        Card[] magicHand = new Card[7]; //Array of object
        for( int i=0;i<magicHand.length;i++)
        {
            magicHand[i] = new Card();
            magicHand[i].setValue(rand.nextInt(12) + 1);//use a method to generate random *13
            magicHand[i].setSuits(Card.SUITS[rand.nextInt(4)]);//random method suit 
        }
        
        Scanner input = new Scanner(System.in);
        System.out.print("Pick a card number (1 to 12): ");
        int guessInt = input.nextInt();
        System.out.print("Pick a card suit (diamonds, clubs, spades, hearts): ");
        String guessSuit = input.next();
        
        boolean match = false;
        for( int i=0;i<magicHand.length;i++)
        {
            if (magicHand[i].getValue() == guessInt && magicHand[i].getSuits().equals(guessSuit))
            {
                match = true;
            }
        }
        
        if (match == true)
        {
            System.out.println("\nThat card is in the hand!!");
        }
        else
        {
            System.out.println("\nThat card is not in the hand.");
        }
        
        System.out.println("\nCards in the hand:");
        for( int i=0;i<magicHand.length;i++)
        {
            System.out.println(magicHand[i].getValue() + " of " + magicHand[i].getSuits());
        }
    }
    
}
