import java.math.BigDecimal;
import java.math.RoundingMode;

public class Trapezoid extends Shape{
  private double baseOfTop;
  private double baseOfBottom;
  private double height;

  public Trapezoid(double baseOfTop, double baseOfBottom, double height, String color) {
    super(color);
    this.baseOfTop = baseOfTop;
    this.baseOfBottom = baseOfBottom;
    this.height = height;
  }

  @Override
  public double area() {
    return BigDecimal.valueOf(this.baseOfTop + this.baseOfBottom)
    .multiply(BigDecimal.valueOf(this.height))
    .divide(BigDecimal.valueOf(2), 2, RoundingMode.HALF_UP)
    .doubleValue();
  }
}
