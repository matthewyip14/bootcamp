import java.util.Arrays;

public class Deck {
  private static final Suit[] SUITS = new Suit[] {Suit.DIAMOND, Suit.CLUB, Suit.HEART, Suit.SPADE};
  private static final int[] RANKS = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
  private Card[] cards;

  public Deck() {
    cards = new Card[52];
    int index = 0;
    for (int i =0; i < SUITS.length; i++) {
      for (int j = 0; j < RANKS.length; i++) {
        this.cards[index++] = new Card(RANKS[j], SUITS[i]);
      }
    }
  }

  public Card[] getCards() {
    return this.cards;
  }

  public static void main(String[] args) {
    Deck deck = new Deck();
    System.out.println(Arrays.toString(deck.getCards()));

    //
    for (Suit suit : Suit.values()) {
      System.out.println(suit);
    }
  }
}
