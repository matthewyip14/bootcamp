import java.math.BigDecimal;
import java.math.RoundingMode;

public class Triangle extends Shape{
  private double height;
  private double base;

  public Triangle(double height, double base, String color) {
    super(color);
    this.height = height;
    this.base = base;
  }

  @Override
  public double area() {
    return BigDecimal.valueOf(this.height)
        .multiply(BigDecimal.valueOf(this.base)) //
        .divide(BigDecimal.valueOf(2.0), 2, RoundingMode.HALF_UP)
        .doubleValue();
  }
}
