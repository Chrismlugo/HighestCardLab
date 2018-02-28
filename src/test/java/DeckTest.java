import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    Deck deck;
    Card card;

    @Before
    public void before(){
        deck = new Deck(52);

    }

    @Test
    public void canAddCardToDeck(){
         deck.addCard(card);
         assertEquals(1, deck.countCards());
    }

    @Test
    public void canPopulateDeck(){
        deck.buildDeck();
        assertEquals(52, deck.countCards());

    }

    @Test
    public void canDealCard(){
        deck.buildDeck();
        assertEquals(52, deck.countCards());
        deck.deal();
        assertEquals(51, deck.countCards());
    }
}
