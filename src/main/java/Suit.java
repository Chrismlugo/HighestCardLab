public enum Suit {
    DIAMONDS(0),
    HEARTS(1),
    CLUBS(2),
    SPADES(3);

    private final int suit;

    Suit(int suit){
        this.suit = suit;
    }

    public int getSuit(){
        return this.suit;
    }
}
