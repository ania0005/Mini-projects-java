package Game21.Test;

import Game21.Card;
import Game21.Deck;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {
    private Deck deck;


    @BeforeEach
    void setUp() {
        deck = new Deck();

    }


    @Test
    public void test_fillArray() {
        deck.fillCards();

        Card[] cards = deck.getCards();
        for (Card card : cards) {
            assertNotNull(card);
        }
    }

    @Test
    public void test_shuffle() {
        deck.fillCards();
        Card[] cards = deck.getCards();
        deck.shuffle();
        Card[] shuffleCards = deck.getCards();
    }
}