import java.math.BigDecimal;


public class Circle {
  private double radius;
  private String color;
  
  
  public double getRadius() {
    return this.radius;
  }
  public void setRadius(double radius) {
    this.radius = radius;
  }
  public String getColor() {
    return this.color;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public Circle(double radius, String color){
    this.radius = radius;
    this.color = color;
  }

  // Type of Method: Presentation
  public double area() {
    return BigDecimal.valueOf(this.radius) //
    .multiply(BigDecimal.valueOf(this.radius)) //
    .multiply(BigDecimal.valueOf(Math.PI)) //
    .doubleValue();
  }

  public static double area2(double radius1) {
    return BigDecimal.valueOf(radius1)
    .multiply(BigDecimal.valueOf(radius1))
    .multiply(BigDecimal.valueOf(Math.PI))
    .doubleValue();
  }

  public double diameter() {
    return BigDecimal.valueOf(this.radius) //
    .multiply(BigDecimal.valueOf(2.0)) //
    .doubleValue(); 
  }

  public static void main(String[] args) {
    Circle c1 = new Circle(3.5, "RED");
    System.out.println(c1.area()); // 3.5 * 3.5 * PI
  

  // c2 -> 4.5 BLUE
    Circle c2 = new Circle(4.5, "BLUE");



  // Circle[] -> c1, c2
    Circle[] circles = new Circle[2];
    circles[0] = c1;
    circles[1] = c2;

  // use array to find c2's color
    System.out.println(circles[0].getColor());
  // use array to find c1's area
    System.out.println(circles[1].area());

    System.out.println(c1.diameter());
    System.out.println(c2.diameter());

    // what if we don't backup the circle address
    Circle[] circles2 = new Circle[3];
    circles2[0] = new Circle(9.0, "BLACK");
    circles2[1] = new Circle(2.3, "YELLOW");
    circles2[2] = new Circle(1.9, "PINK");

    System.out.println(Circle.area2(3.5)); // 38.48451000647496
  }
}
