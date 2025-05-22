import java.util.Objects;

public class Card {
  private static final int DIAMOND = 1;
  private static final int CLUB = 2;
  private static final int HEART = 3;
  private static final int SPADE = 4;

  private static final int ACE = 1;
  // ...
  // ...
  private static final int KING = 13;

  private int rank; //
  private Suit suit; // Suit.class

  public Card(int rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public int getRank() {
    return this.rank;
  }

  public Suit getSuit() {
    return this.suit;
  }

  

  // ! Override false -> true
  @Override
  public boolean equals(Object obj) {
    // Part 1: check address first
    if (this == obj)
      return true;
    // Part 2: check if Card object
    if (!(obj instanceof Card))
      return false;
    // Part 3: rank && suit
    Card card = (Card) obj;
    return this.rank == card.getRank() && this.suit == card.getSuit();
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.rank, this.suit);
  }

  @Override
  public String toString() {
    return "Card(" + "rank=" + this.rank + ",suit=" + this.suit + ")";
  }

  // ACE Diamond vs King Diamond -> 1
  // King Diamond vs ACE Diamond -> -1
  public int compareTo(Card card) {
    if (this.rank == card.getRank()) {
      // int result = compareTo(this.suit, card.getSuit());
      int result = this.getSuit().compareTo(card.getSuit());
      if (result > 0)
        return -1;
      else if (result == 0)
        return 0;
      else
        return 1;
    }
    return this.rank > card.getRank() ? -1 : 1;
  }

  // suit -> D, C, H, S
  public static int compareTo(int suit1, int suit2) {
    if (suit1 == suit2)
      return 0;
    if (suit1 > suit2)
      return -1;
    return 1;
  }

  public static void main(String[] args) {
    Card c1 = new Card(ACE, Suit.DIAMOND);
    Card c2 = new Card(ACE, Suit.SPADE);
    Card c3 = new Card(ACE, Suit.SPADE);
    System.out.println(c2.compareTo(c1)); // 1
    System.out.println(c1.compareTo(c2)); // -1
    System.out.println(c2.compareTo(c3)); // 0

    Card c4 = new Card(ACE, Suit.SPADE);
    Card c5 = new Card(KING, Suit.SPADE);
    System.out.println(c5.compareTo(c4)); // -1

  }
}