import java.math.BigDecimal;

public class Rectangular extends Shape {
  private double length;
  private double width;

  public Rectangular(double length, double width) {
    this.length = length;
    this.width = width;
  }
  
  @Override
  public double area() {
    return BigDecimal.valueOf(this.length)
        .multiply(BigDecimal.valueOf(this.width)) //
        .doubleValue();
  }
}