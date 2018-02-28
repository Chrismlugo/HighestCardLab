import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    Player player;
    Hand hand;
    Deck deck;
    Card card;

    @Before
    public void before(){
        player = new Player("bob",hand);
        deck = new Deck(52);
        deck.buildDeck();
    }

    @Test
    public void canCountPlayersHand(){
        assertEquals(0, player.hand.countHand());
    }

    @Test
    public void canBeDealtCardToHand(){
        player.hand.takeCard(deck);
        assertEquals(51, deck.countCards());
        assertEquals(1, player.hand.countHand());

    }
}
