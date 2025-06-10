import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DemoOptional {
  public static void main(String[] args) {
    List<Integer> integers = new ArrayList<>(Arrays.asList(8,-2,100));
    Integer result = findFirstOddNumber(integers);
    System.out.println(result.doubleValue());



    // Approach 2
    Interger result2 = optionalResult.orElse(-99)
  }

  // what if no odd number
  // not found -> Is NOT an exception
  // ! Java 8 has a better solution for this scenario.
  public static Integer findFirstOddNumber(List<Integer> integers) {
    for (Integer integer : integers) {
      if (integer % 2 == 1)
        return integer;
    }
    return null; // not found
  }

  // ! Java 8 has a better solution for this scenario.
  public static Optional<Integer> findFirstOddNumber2(List<Integer> integers) {
    for (Integer integer : integers) {
      if (integer % 2 == 1)
        return integer;
    }
    return null; // not found
  }

  // how about we use Optional for input param?
  public static Integer sum(Optional<Integer> x, Optional<Integer> y) {
    // if (x == null || y == null)
    //   throw new IllegalArgumentException("x and y should not be null.");
    return x.get() + y.get();
  }
}
