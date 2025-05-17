public abstract class Shape {
  private String color;
  public static int counter = 0;

  public Shape(String color) {
    counter++;
    this.color = color;
  }
  public String getColor() {
    return this.color;
  }

  public abstract double area();

  public static void main(String[] args) {
    Shape shape1 = new Circle1(3.5, "Black");
    System.out.println(shape1.area()); // 38.48451000647496
    shape1 = new Rectangular(3.5, 4.5, "White");
    System.out.println(shape1.area()); // 15.75

    Shape[] shapes = new Shape[5];
    shapes[0] = new Circle1(3.5, "Navy");
    shapes[1] = new Rectangular(3.5, 7.5, "Green");
    shapes[2] = new Circle1(10.5, "Red");
    shapes[3] = new Triangle(10, 5, "Pink");
    shapes[4] = new Trapezoid(4, 5, 10, "Orange");
    for (int i = 0; i < shapes.length; i++) {
      System.out.println(shapes[i].area());
    }
    System.out.println(counter);
  }
}