import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
  public static void main(String[] args) {
    String[] arr = new String[] {"abc", "def", "ijk"};
    
    for (String s : arr) {
      System.out.println(s);
    }

    // Disadvantages of array:
    // 1. Fixed Length (ArrayList fixed this issue)
    // 2. Same type of value (Java won't solve this issue)

    // Java allow Object[] to store any type of objects...
    // but Java follow Polymorphism, the allowed methods refers to the type of object reference.
    Object[] arr2 = new Object[] {"abc", 10, 9.99};
    for (Object s : arr2) {
      if (s instanceof String) {
        String str = (String) s;
        System.out.println(str.charAt(0));
      }
    }

    // ArrayList: variable length
    // The underlying the data structure of ArrayList -> array.
    ArrayList<String> names = new ArrayList<String>();
    names.add("John");
    names.add("Peter");
    System.out.println(names.size()); // 2

    names.remove("Peter");
    System.out.println(names.size()); // 1

    names.add("Jennie");
    // Author of ArrayList override toString()
    System.out.println(names); // [John, Jennie]

    StringArrayList sal = new StringArrayList();
    sal.add("abc");
    sal.add("def");
    sal.add("vincent");
    System.out.println(sal.size()); // 3
    sal.remove("def");
    System.out.println(sal.size()); // 2

    // ! contains() -> loop & equals()
    if (names.contains("Jennie")) {

    }

    if (!names.contains("Peter")) {

    }

    System.out.println(names.indexOf("John")); // 0
    System.out.println(names.indexOf("Jennie")); // 1
    System.out.println(names.indexOf("Peter")); // -1 (not found)

    if (!names.isEmpty()) {

    }

    // ! because ArrayList is with ordering
    System.out.println(names.getFirst()); // John
    System.out.println(names.get(1)); // Jennie
    // System.out.println(names.get(2)); // java.lang.IndexOutOfBoundsException

    List<String> reversed = names.reversed();
    System.out.println(reversed); // [Jennie, John]

    String oldValue = reversed.set(1, "Steve");
    System.out.println(oldValue); // John
    System.out.println(reversed); // [Jennie, Steve]

    names.clear();
    System.out.println(names.isEmpty()); // true
    System.out.println(names.size()); // 0
    names = null; // what is difference between line 72 (clear) and null
    // System.out.println(names.size()); // error

    // remove Dog (equals)
    ArrayList<Dog> dogs = new ArrayList<>();
    dogs.add(new Dog("John"));
    dogs.add(new Dog("Peter"));
    
    dogs.remove(new Dog("Peter"));
    System.out.println(dogs);

    // remove("Peter"), remove the first "Peter"
  }
}