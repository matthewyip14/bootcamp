public class Calculator {
  private int x;
  private int y;

  public Calculator(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int sum() {
    return this.x + this.y;
  }
  public int product() {
    return this.x * this.y;
  }

  public void setX(int x) {
    this.x = x;
  }
  public void setY(int y) {
    this.y = y;
  }

  public static int sum(int x, int y) {
    return x + y;
  }
  public static int product(int x, int y) {
    return x * y;
  }

  public static void main(String[] args) {
    // Store a set of x and y
    Calculator c1 = new Calculator(2, 3);
    System.out.println(c1.sum()); // 5
    System.out.println(c1.product()); // 6
    c1.setY(10);
    System.err.println(c1.sum()); // 12

    System.err.println(Calculator.sum(2, 9));
    System.out.println(Calculator.product(2, 9));
    

  }
}
