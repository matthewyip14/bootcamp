import java.util.HashSet;

public class DemoHasgSet {
  public static void main(String[] args) {
    HashSet<String> strings = new HashSet<>();
    strings.add("John");
    strings.add("Peter");
    strings.add("Lucas");
    System.out.println(strings.size()); // 3
    System.out.println(strings); // [John, Lucas, Peter]

    // The underlying data structure is not array.
    strings.remove("Peter"); // equals()
    
    // The difference between ArrayList and HashSet
    // 1. No ordering
    // 2. Naturally avoid duplicated values

    boolean result = strings.add("John");
    System.out.println(result); // false
    System.out.println(strings); // 

  }
}
