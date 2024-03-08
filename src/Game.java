import java.util.ArrayList;
import java.util.List;

public class Game {

    int numberOfPlayers;
    Deck deck;
    List<Hand> handList = new ArrayList<>(numberOfPlayers);

    public Game(int numberOfPlayers, Deck deck) {
        this.numberOfPlayers = numberOfPlayers;
        this.deck = deck;
    }

    class Hand{
        List<Card> handCards = new ArrayList<>(6);

        public void takeCard(){
            if(handCards.size() < 6){
                handCards.add(deck.getFirstCard());
                System.out.println("Took: " + deck.getFirstCard().toString());
                deck.cardList.remove(0);
                this.printHand();
            }else {
                System.out.println("You can't take card");
            }
        }
        public void printHand(){
            handCards.forEach(System.out::println);
        }
    }
}
