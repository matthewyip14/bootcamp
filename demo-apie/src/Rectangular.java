import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rectangular extends Shape {
  private double length;
  private double width;

  public Rectangular(double length, double width, String color) {
    super(color);
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