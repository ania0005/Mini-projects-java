package Game21;

import java.util.Objects;

public class Card implements Comparable<Card> {
    //
    //
    private final int VALUE;
    private final String SUIT;

    public Card(int value, String suit) {
        this.VALUE = value;
        this.SUIT = suit;
    }

    public int getValue() {
        return VALUE;
    }

    public String getSuit() {
        return SUIT;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (VALUE != card.VALUE) return false;
        return Objects.equals(SUIT, card.SUIT);
    }

    @Override
    public int hashCode() {
        int result = VALUE;
        result = 31 * result + (SUIT != null ? SUIT.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return SUIT + " " + VALUE;
    }

    @Override
    public int compareTo(Card other) {
        int cardCompare = this.SUIT.compareTo(other.SUIT);
        return cardCompare != 0 ? cardCompare : Integer.compare(this.getValue(), other.getValue());
    }
}
