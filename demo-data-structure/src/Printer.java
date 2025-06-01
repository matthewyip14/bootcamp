// Java Generic
// ! 1. Less code/class during compile time
// ! 2. You still need to define the T type during runtime

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

// E -> Java for Collection.class
// K,V -> Java for Map
//T, U, V
public class Printer<T> {
   private T value;

  public Printer(T value) {
    this.value = value;
  }

  public void print() {
    System.out.println(value);
  }

  public void setValue(T value) {
    this.value = value;
  }
  public T getValue() {
    return this.value;
  }

  //static method

  
  public static void main(String[] args) {
    // Runtime: StringPrinter
    Printer<String> sp = new Printer<>("hello");
    // sp.setValue(100); // error, because you already defined T is String
    sp.setValue("goodbye");

    Printer<Integer> ip = new Printer<>(10);
    ip.setValue(1000);
    ip.print(); // 1000

    // ! You don't need to write StingArrayList, IntegerArrayList
    ArrayList<String> names = new ArrayList<>();
    names.add("Peter"); 


    HashMap<String, List<Dog>> dogMap = new HashMap<>();
    List<Dog> dogList1 = new LinkedList<>();
    dogList1.add(new Dog("john"));
    dogList1.add(new Dog("Peter"));
    dogMap.put("ABC", dogList1);
    List<Dog> dogList2 = new LinkedList<>();
    dogList2.add(new Dog("Lucas"));
    dogList2.add(new Dog("Oscar"));
    dogMap.put("XYZ", dogList2);
    System.out.println(dogMap.get("XYZ"));

    Printer<List<Dog>> dogListPrinter = new Printer<>(new linkedlist<>());
    dogListPrinter.getValue().add(new Dog("John"));
    dogListPrinter.getValue().add(new Dog("Peter"));
    dogListPrinter.print();


  }
}
