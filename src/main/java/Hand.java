import java.util.ArrayList;

public class Hand {

    ArrayList<Card> hand;

    public Hand(){
        this.hand = new ArrayList<>();
    }

    public int countHand(){
        return this.hand.size();
    }

    public void addCard(Deck deck){
        Card card = deck.deal();
         this.hand.add(card);
    }


}
