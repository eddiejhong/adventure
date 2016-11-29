import java.util.Random;
import java.util.ArrayList; // dynamic array that can change size. Array cannot change size.

public class Deck {
    private ArrayList<Card> _cards;

    public static void main(String[] args)
    {
    }

    public ArrayList<Card> generateDeck()
    {
        _cards = new ArrayList<Card>();

        for (short a=1; a<=4; a++) {
            for (short b=1; b<=13; b++) {
                _cards.add( new Card(a,b) );
            }
        }

        return _cards;
    }

    public ArrayList<Card> shuffle(ArrayList<Card> cards)
    {
        int index_1, index_2;
        Random generator = new Random();
        Card temp;

        for (int i=0; i<100; i++) {
            index_1 = generator.nextInt( cards.size() - 1 );
            index_2 = generator.nextInt( cards.size() - 1 );

            temp = _cards.get( index_2 );
            cards.set( index_2 , _cards.get( index_1 ) );
            cards.set( index_1, temp );
        }

        return cards;
    }

    public Card draw()
    {
        return _cards.remove( 0 );
    }

    public int getCardCount()
    {
        return _cards.size();   //we could use this method when making a complete poker game to see if we needed a new deck
    }
}
