public class IntegerPrinter {
  private Integer value;

  public IntegerPrinter(Integer value) {
    this.value = value;
  }

  public void print() {
    System.out.println(this.value);
  }

  public static void main(String[] args) {
    IntegerPrinter sp = new IntegerPrinter(1);
    sp.print(); // 1
  }
}
