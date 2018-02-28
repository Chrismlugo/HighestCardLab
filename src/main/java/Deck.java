import java.util.ArrayList;

public class Deck {
    private int capacity;

    ArrayList<Card> deck;


    public Deck(int capacity){
        this.deck = new ArrayList<>();
    }

    public void addCard(Card card){
        deck.add(card);
    }

    public int countCards(){
      return  deck.size();
    }

    public void buildDeck(){

        for (Suit suit : Suit.values()){
            for (Rank rank : Rank.values()){
                deck.add(new Card(suit, rank));
            }
        }
    }

    public Card deal(){
        return this.deck.remove(0);
    }
}
