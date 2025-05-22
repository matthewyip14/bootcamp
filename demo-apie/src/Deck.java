import java.util.Arrays;

public class Deck {
  private static final int[] RANKS =
      new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
  private static final Suit[] SUITS =
      new Suit[] {Suit.DIAMOND, Suit.CLUB, Suit.HEART, Suit.SPADE};
  private Card[] cards;

  public Deck() {
    cards = new Card[RANKS.length * SUITS.length];
    int index = 0;
    for (int i = 0; i < SUITS.length; i++) { // 4
      for (int j = 0; j < RANKS.length; j++) { // 13 times
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

    int[] arr = new int[] {3, 2, 1};
    System.out.println(Arrays.toString(arr));

    // for-each
    for (Suit suit : Suit.values()) {
      System.out.println(suit);
    }
    System.out.println(Suit.values().length);
    System.out.println(Suit.DIAMOND.ordinal()); // 0
    System.out.println(Suit.HEART.ordinal()); // 2
  }
}