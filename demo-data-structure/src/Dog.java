import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Dog extends Animal implements Comparable<Dog>{
  private String name;

  public Dog(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  // this (-1) vs dog (1)
  @Override
  public int compareTo(Dog dog) {
    return this.name.compareTo(dog.getName()) > 0 ? 1 : -1;
  }
  // ! you should override
   // ! so that list.remove() able to remove the same dog (your definition)
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;

    if (!(obj instanceof Dog))
      return false;

    Dog dog = (Dog) obj;
    return this.name == dog.getName();    
  } 

  @Override
  public void walk() {
    System.out.println("Dog is walking...");
  }

  @Override
  public String toString() {
    return "Dog("
      + "name=" + this.name
      + ")";
  }
  public static void main(String[] args) {
    List<Dog> dogs = new ArrayList<>();
    dogs.add(new Dog("Mary"));
    dogs.add(new Dog("Alex"));
    dogs.add(new Dog("Paul"));

    // Comparable Approach: as long as Dog implement comparable
    // disadvantage: every class has one sorting formula ONLY, but Comparator approach can be more formula for a runtime
    Collection.sort(dogs);
    System.out.println(dogs);
  }
}
