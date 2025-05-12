public class Shape {
  private static int counter = 0;
  private static final double PI = 3.14159; // constant
  private final String name = "John";
  private String color; // attribute (usually we have setter, because it is not final.)
  // final -> finalized

  public Shape() {
    
  }
  public String getName() {
    return this.name;
  }


  public static void main(String[] args) {
    System.err.println(Shape.PI);
    //! Because Shape.PI is a "final" variable, so connot be modified.
    // Shape.PI += 1;
    Shape.counter += 1;
    System.out.println(Shape.counter); // 1

    new Shape().counter++; // NOT recommended
    Shape.counter++; // Normal
    System.out.println(Shape.counter); // 3

    Shape s1 = new Shape();
    System.err.println(s1.getName()); // John

    System.err.println(new Shape().getName()); // John
  }
}
