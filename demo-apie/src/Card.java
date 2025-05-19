import java.util.Objects;

public class Card {
  public static final int DIAMOND = 1;
  public static final int CLUB = 2;
  public static final int HEART = 3;
  public static final int SPADE = 4;

  private int rank;
  private int suit;  // suit class


  public Card(int rank, int suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public int gerRank() {
    return this.rank;
  }
  public int getSuit() {
    return this.suit;
  }
  // ! Override false -> true
  @Override
  public boolean equals(Object obj) {
    // Part 1: check address first
    if (this == obj)
      return true;
    // Part 2. check if Card object
    if (!(obj instanceof Card))
      return false;
    // Part 3. chec
    Card card = (Card) obj;
    return this.rank == card.gerRank() && this.suit == card.getSuit();
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.rank, this.suit);
  }

  @Override
  public String toString() {
    return "Card("
      + "rank=" + this.rank
      + ",suit=" + this.suit
      + ")";
  }
  // ACE Diamond vs King Diamond -> 1
  // King Diamond vs ACE Diamond -> -1
  public int compareTo(Card card) {
    if (this.rank == card.gerRank()){
      int result = compareTo(this.suit, card.getSuit());
      if (result > 0)
        return -1;
      else if (result == 0)
        return 0;
      else
        return 1;
    }
    return this.rank >  card.gerRank() ? -1 : 1;
  }
  
  public static int compareTo(char suit1, char suit2) {
    if (suit1 == suit2)
      return 0;
    if (suit1 > suit2)
      return -1;
    return 1;
  }

  public static void main(String[] args) {
    
  }

}
