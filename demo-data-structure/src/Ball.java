import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ball {
  private Color color;

  public Ball(Color color) {
    this.color = color;
  }
  
  public Color getColor() {
    return this.color;
  }
  public static enum Color {
    RED, BLUE, YELLOW,;
  }
  public int getNumber() {
    return this.number;
  }

  @Override
  public String toString() {
    return "Ball("
      + "color=" + this.color
      + ")";
  }
  public static void main(String[] args) {
    List<Ball> balls = new ArrayList<>();
    balls.add(new Ball(Color.BLUE));
    balls.add(new Ball(Color.YELLOW));
    balls.add(new Ball(Color.RED));
    balls.add(new Ball(Color.YELLOW));

    // Arrays.sort() -> sort array

    // sort List
    Collections.sort(balls, new SortByColor());
    System.out.println(balls);

    // SortByColor.java
    // Yellow -> Red ->  Blue
  
    // Assignment: SortByBall2.java
    // Sort color first, if color is same, larger number goes first.
    // YELLOW,9 -> YELLOW,5 -> RED,1000 -> BLUE,10 -> BLUE,2


  }
}
