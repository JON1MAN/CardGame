import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck extends Card{
    public List<Card> cardList = new ArrayList<>(52);

    public Deck() {
        System.out.println("-".repeat(20) + "Standard deck" + "-".repeat(20));
        cardList = getStandardDeck();
    }

    public Card getFirstCard(){
        return cardList.get(0);
    }

    public static List<Card> getStandardDeck() {

        List<Card> deck = new ArrayList<>(52);
        for (Card.Suit suit : Card.Suit.values()) {
            for (int i = 2; i <= 10; i++) {
                deck.add(getNumericCard(suit, i));
            }
            for (char c : new char[]{'J', 'Q', 'K', 'A'}) {
                deck.add(getFaceCard(suit, c));
            }
        }
        return deck;
    }

    public static void printDeck(List<Card> deck) {
        printDeck(deck, "Current Deck", 4);
    }

    public static void printDeck(List<Card> deck, String description, int rows) {

        System.out.println("---------------------------");
        if (description != null) {
            System.out.println(description);
        }
        int cardsInRow = deck.size() / rows;
        for (int i = 0; i < rows; i++) {
            int startIndex = i * cardsInRow;
            int endIndex = startIndex + cardsInRow;
            deck.subList(startIndex, endIndex).forEach(c -> System.out.print(c + " "));
            System.out.println();
        }
    }
    public void shuffleDeck(){
        Collections.shuffle(this.cardList);
    }
}
