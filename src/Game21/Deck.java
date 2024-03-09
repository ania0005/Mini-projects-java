package Game21;

import java.util.Iterator;
import java.util.Random;

public class Deck implements Iterable<Card> {
    public Card[] cards;

    public Deck() {
        this.cards = new Card[36];
        fillCards();
        shuffle();
    }

    public void fillCards() {
        String[] suits = {"Пики", "Червы", "Бубны", "Трефы"};
        int index = 0;

        for (String suit : suits) {
            for (int cardValue = 2; cardValue <= 10; cardValue++) {
                new Card(cardValue, suit);
                this.cards[index++] = new Card(cardValue, suit);
            }
        }
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = cards.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            Card temp = cards[index];
            cards[index] = cards[i];
            cards[i] = temp;


        }

    }

    public Card[] getCards() {
        return cards;
    }

    @Override
    public Iterator<Card> iterator() {

        return new Iterator<>() {
            private int curPos = 0;

            @Override
            public boolean hasNext() {

                return curPos < cards.length;
            }

            @Override
            public Card next() {
                return cards[curPos++];
            }
        };
    }
}
