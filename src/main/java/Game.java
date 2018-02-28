import java.util.ArrayList;

public class Game {
    public Deck deck;

    ArrayList<Player> players;

    public Game(){
        deck = new Deck(52);
        players = new ArrayList<>();
    }

    public int countPlayers(){
      return  players.size();
    }

    public void addPlayer(Player player){
        players.add(player);

    }



}
