import java.math.BigDecimal;

public class Vincent {
  public static double area2(double radius) {
    return BigDecimal.valueOf(radius) //
        .multiply(BigDecimal.valueOf(radius)) //
        .multiply(BigDecimal.valueOf(Math.PI)) //
        .doubleValue(); 
  }
}