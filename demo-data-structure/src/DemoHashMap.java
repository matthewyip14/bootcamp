import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DemoHashMap {
  public static void main(String[] args) {
    // A set of same type values: array, ArrayList, HashSet

    // Key -> Get a set of same type values
    // HashMap<key, Value>
    HashMap<String, String> fruitMap = new HashMap<>();
    fruitMap.put("A", "Apple"); // put one entry
    fruitMap.put("O", "Orange"); // put one entry
    fruitMap.put("L", "Lemon"); // put one entry
    System.out.println(fruitMap.size()); // 3
    System.out.println(fruitMap.get("A")); // Apple
    System.out.println(fruitMap.get("X")); // null
    if (fruitMap.containsKey("A")) {
    
    }
    if (fruitMap.containsValue("Apple")) {

    }
    String removeValue = fruitMap.remove("O");
    System.out.println(removeValue); // Orange

    // HashMap
    // 1. No Ordering

    // sfor-each loop
    for (Map.Entry<String, String> entry : fruitMap.entrySet()) {
      System.out.println(entry.getKey() + "," + entry.getValue());
    }

    // new LinkedHashMap<>();
  }
}
