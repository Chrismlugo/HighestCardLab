import org.junit.Before;
import org.junit.Test;
import sun.rmi.rmic.iiop.ValueType;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(Suit.CLUBS, Rank.ACE);
    }

    @Test
    public void canGetSuit(){
        assertEquals(Suit.CLUBS, card.getSuit());
    }

    @Test
    public void suitReturnsString(){
        assertEquals("Clubs", card.getSuitFromEnum());
    }

    @Test
    public void cardHasAce(){
        assertEquals(1, card.getValueFromEnum());
    }



}
