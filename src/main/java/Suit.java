public enum Suit {
    DIAMONDS("Diamonds"),
    HEARTS("Hearts"),
    CLUBS("Clubs"),
    SPADES("Spades");

    private final String suit;

    Suit(String suit){
        this.suit = suit;
    }

    public String getSuit(){
        return this.suit;
    }
}
