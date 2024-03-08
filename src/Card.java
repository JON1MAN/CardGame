public class Card {

    private String face;
    private int rank;
    private Suit suit;
    public enum Suit{
        CLUB, DIAMOND, HEART, SPADE;
        char getImage(){
            return (new char[]{9827, 9830, 9829, 9824})[this.ordinal()];
        }

    }

    public Card(String face, int rank, Suit suit) {
        this.face = face;
        this.rank = rank;
        this.suit = suit;
    }

    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Card() {
    }

    @Override
    public String toString() {
        int index = face.equals("10") ? 2 : 1;
        String faceCard = face.substring(0, index);
        return String.format("%s%c(%d)", faceCard, suit.getImage(), rank);
    }

    public static Card getNumericCard(Suit suit, int number){

        if(number > 1 && number < 11){
            return new Card(String.valueOf(number), number - 2, suit);
        }
        System.out.println("Invalid Numeric card selected");
        return null;
    }
    public static Card getFaceCard(Suit suit, char abbrev){
        int charIndex = "JQKA".indexOf(abbrev);
        if(charIndex > -1){
            return new Card("" + abbrev, charIndex + 9, suit);
        }
        System.out.println("Invalid Face card selected");
        return null;
    }






}
