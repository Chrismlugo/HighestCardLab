import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HandTest {
    Hand hand;
    Deck deck;
    Card card;

    @Before
    public void before(){
        hand = new Hand();
        deck = new Deck(52);
        deck.buildDeck();
    }

    @Test
    public void canCountHand(){
        assertEquals(0, hand.countHand());
    }

    @Test
    public void canTakeCardFromDeck(){
        hand.addCard(deck);
        assertEquals(51, deck.countCards());
        assertEquals(1, hand.countHand());
    }
}
