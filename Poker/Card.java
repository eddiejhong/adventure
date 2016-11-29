public class Card
{
    // integer representations of rank and suit
    private short _rank, _suit;

    // string representations of suit
    private static String[] suits = { "hearts", "spades", "diamonds", "clubs" };
    private static String[] ranks  = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

    // get only the rank as a string
    public static String rankAsString( short rank ) {
        return ranks[rank];
    }

    // constructor?
    Card(short suit, short rank)
    {
        _rank=rank;
        _suit=suit;
    }

    // Card.toString returns string representation of card
    public @Override String toString()
    {
          return ranks[_rank] + " of " + suits[_suit];
    }

    public short getRank() {
         return _rank;
    }

    public short getSuit() {
        return _suit;
    }
}
