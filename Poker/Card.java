public class Card
{
    // integer representations of rank and suit
    private short rank, suit;

    // string representations of suit
    private static String[] suits = { "hearts", "spades", "diamonds", "clubs" };
    private static String[] ranks  = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

    public static String rankAsString( int __rank ) {
        return ranks[__rank];
    }

    // constructor?
    Card(short suit, short rank)
    {
        this.rank=rank;
        this.suit=suit;
    }

    // Card.toString returns string representation of card
    public @Override String toString()
    {
          return ranks[rank] + " of " + suits[suit];
    }

    public short getRank() {
         return rank;
    }

    public short getSuit() {
        return suit;
    }
}
