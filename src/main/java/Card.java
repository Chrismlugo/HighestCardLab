import sun.rmi.rmic.iiop.ValueType;

public class Card {

    private final Rank rank;
    private Suit suit;
    private ValueType value;

    public Card(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getValueFromEnum(){
        return this.rank.getRank();
    }

    public String getSuitFromEnum(){
        return this.suit.getSuit();
    }
}
