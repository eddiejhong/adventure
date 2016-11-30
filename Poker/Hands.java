public class Hands {

    private ArrayList<string> _hands = {"high card", "pair", "two pair", "three of a kind", "straight", "flush", "full house", "four of a kind", "straight flush", "royal flush"};
    // hands where suit matters: flush, straight flush, royal flush (all 5 are one suit)
    // hands where order matters: straight, straight flush, royal flush

    // for 5 card, only one set of cards
    // TODO: for hold'em, 21 possible combinations (7!/5!2!) 7 choose 5

    // example hand: 3c 4d 3h 7s 7c
    // populate object?

    // 1, 2, 2/2, 3, x:x+5, x:x, 3/2, 4, x:x+5!

    public getHandStrength(hand) {
        handSuits = getHandSuits();
        handRanks = getHandRanks();

        isFlush = isFlush(handSuits);
        isStraight = isStraight(handRanks);

        switch(true) {
            // Royal flush
            case: isStraight() && isFlush && hasAce()
                return _hands[last]
                break;
            // straight flush
            case: isStraight() && isFlush
            // four of a kind
            case:
        }

        // return object containing: index of hand in _hands, array of card index related to the hand (e.g. two-pair would return the cards that are paired in hand, highest first [9,3]))
    }

    public boolean isFlush(Map handSuits) {
        // c: 2
        // d: 1
        // h: 1
        // s: 1

        // c: 5
        // d: 0
        // h: 0
        // s: 0

        for (Type item : iterableCollection) {
            // Do something to item
            if (item === 5) {
                return true;
            }
        }

        return false;
    }


    public boolean isStraight() {
    // 3: 2
    // 4: 1
    // 7: 2

    // 3: 2
    // 4: 1
    // 9: 2
        // sort collection by key?

        for (Type item : iterableCollection) {
            // Do something to item
            if (lastkey - firstkey === 5) {
                return true;
            }
        }

        return false;
    }
}
