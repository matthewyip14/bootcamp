public class Ball { // ! Outer Class
  private static String value = "hello";
  private Color color;

  public Ball(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }

  public static enum Color { // ! Inner Class 
    BLUE, RED, YELLOW,;

    public static void printValue() {
      System.out.println(value); // ! able to access Outer class static variable
    }
  }

  public static void main(String[] args) {
    Ball b1 = new Ball(Ball.Color.BLUE);
    System.out.println(b1.getColor());
    Ball b2 = new Ball(Ball.Color.YELLOW);
    System.out.println(b2.getColor());

    Ball.Color.printValue();
  }
}