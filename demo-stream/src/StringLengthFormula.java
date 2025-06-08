import java.util.function.Function;

public class StringLengthFormula implements Function<String, Integer> {
  @Override
  public Integer apply(String t) {
    return t.length();
  }
}