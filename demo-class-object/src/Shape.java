public class Shape {
  private static int counter = 0;
  private static final double PI = 3.14159; // "static final" -> constant
  private final String name = "John";
  private String color; // attribute (usually we have setter, because it is not final)
  // final -> finalized

  public Shape() {

  }

  public String getName() {
    return this.name;
  }

  public static void main(String[] args) {
    System.out.println(Shape.PI); // 3.14159
    // ! because Shape.PI is a "final" variable, so cannot be modified.
    // Shape.PI += 1;
    Shape.counter++;
    System.out.println(Shape.counter); // 1

    new Shape().counter++; // Not recommended
    Shape.counter++; // Normal usage
    System.out.println(Shape.counter); // 3

    // print John
    Shape s1 = new Shape();
    System.out.println(s1.getName()); // John

    System.out.println(new Shape().getName()); // John
  }

}