import java.util.function.Supplier;

public class DemoMethodReference {
  public static void main(String[] args) {
    String name = "John";
    Supplier<Integer> lengthSupplier = () -> name.length();
    int length = lengthSupplier.get();

    // method reference
    Supplier<Integer> lengthSupplier2 = name::length; // variable.intanceMethod()
    int length2 = lengthSupplier2.get();
  
    String s = "hello";
    // int result = s::length; // ! it is not a formula
  }
}
