import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class DemoMethodReference {

  public static void main(String[] args) {
    String name = "John";

    // lambda expression
    Supplier<Integer> lengthSupplier = () -> name.length(); // "() -> name.length()" is a formula
    int length = lengthSupplier.get();

    // method reference
    Supplier<Integer> lengthSupplier2 = name::length; // variable.intanceMethod()
    int length2 = lengthSupplier2.get();

    String s = "hello";
    // int result = s::length; // ! it is not a formula

    List<String> words = Arrays.asList("cherry", "banana", "apple");
    // lambda expression
    Comparator<String> compareToIgnoreCase =
        (s1, s2) -> s1.compareToIgnoreCase(s2);
    words.sort(compareToIgnoreCase);

    // method reference
    Comparator<String> compareToIgnoreCase2 = String::compareToIgnoreCase;
    words.sort(compareToIgnoreCase2);

    Function<String, Integer> stringToInteger = a -> Integer.valueOf(a);
    Function<String, Integer> stringToInteger2 = Integer::valueOf;

    Supplier<String> stringObject = () -> new String(); // empty constructor
    Supplier<String> stringObject2 = String::new; // empty constructor

  }
}