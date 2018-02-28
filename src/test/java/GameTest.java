import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    Game game;
    Player player;
    Hand hand;
    Deck deck;
    Card card;

    @Before
    public void before(){
        game = new Game();
        game.deck.buildDeck();

    }

    @Test
    public void gameHasFullDeck(){
        assertEquals(52, game.deck.countCards());
    }

    @Test
    public void gameHasNoPlayers(){
        assertEquals(0, game.countPlayers());
    }

    @Test
    public void canAddPlayers(){
        game.addPlayer(player);
        assertEquals(1, game.countPlayers());
    }





}
