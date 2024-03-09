package Game21.Test;

import Game21.Card;
import Game21.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    private Player player;


    @BeforeEach
    void setUp() {
        player = new Player("Vasja");
        Card card1 = new Card(5, "Бубны");
        Card card2 = new Card(8, "Червы");
        Card card3 = new Card(4, "Бубны");
        Card card4 = new Card(2, "Червы");
        Card card5 = new Card(3, "Червы");
        player.drawCard(card1);
        player.drawCard(card2);
        player.drawCard(card3);
        player.drawCard(card4);
        player.drawCard(card5);
    }

    @Test
    public void test_drawCard() {

    }

}