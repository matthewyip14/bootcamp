import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream {
  public static void main(String[] args) {
    List<Dog> dogs = new ArrayList<>();
    dogs.add(new Dog("ABC", 10));
    dogs.add(new Dog("DEFO", 7));
    dogs.add(new Dog("IJK", 8));

    // Prepare a new arraylist contains dogs with age >= 8
    // ! Filtering - for-each
    List<Dog> newDogs = new ArrayList<>();
    for (Dog dog : dogs) {
      if (dog.getAge() >= 8) {
        newDogs.add(dog);
      }
    }
    System.out.println(newDogs); // [Dog(name=ABC,age=10), Dog(name=IJK,age=8)]

    // ! Filtering - Stream
    // List -> Stream
    Stream<Dog> newDogs2 = dogs.stream();
    // Use filter() in Stream<>
    // Use predicate
    Stream<Dog> newDogs3 = newDogs2.filter(d -> d.getAge() >= 8);
    // from Stream<Dog> to List<Dog>
    List<Dog> newDogs4 = newDogs3.collect(Collectors.toList());
    System.out.println(newDogs4); // [Dog(name=ABC,age=10), Dog(name=IJK,age=8)]

    List<Dog> newDogs5 = dogs.stream() //
        .filter(d -> d.getAge() >= 8) //
        .collect(Collectors.toList());
    System.out.println(newDogs5); // [Dog(name=ABC,age=10), Dog(name=IJK,age=8)]

    // Dog name starts with "D"
    List<Dog> newDogs6 = dogs.stream() //
        .filter(d -> d.getName().startsWith("D")) //
        .collect(Collectors.toList());
    System.out.println(newDogs6);

    // name length > 3 and age < 8
    // ! filter supports AND OR
    List<Dog> newDogs7 = dogs.stream() //
        .filter(d -> d.getName().length() > 3 && d.getAge() < 8) // ! Predicate
        .collect(Collectors.toList());
    System.out.println(newDogs7);

    // ! Traditional way to get dog names
    // List<Dog> -> List<String> (Conversion of type)
    List<String> names = new ArrayList<>();
    for (Dog d : dogs) {
      names.add(d.getName());
    }
    System.out.println(names); // [ABC, DEFO, IJK]

    // ! map - Stream
    // List<Dog> -> List<String> (Conversion of type)
    List<String> names2 = dogs.stream() //
        .map(d -> d.getName()) // ! Function<Dog, String>
        .collect(Collectors.toList());
    System.out.println(names2); // [ABC, DEFO, IJK]

    // ! Stream - filter + map
    // find all dog names, whose age > 9
    List<String> names3 = dogs.stream() //
        .filter(dog -> dog.getAge() > 9) //
        .map(dog -> dog.getName()) //
        .collect(Collectors.toList());
    System.out.println(names3);

    // ! Example: Staff, filter + map + for-each
    List<Staff> staffs = new ArrayList<>();
    staffs.add(new Staff("Mary", LocalDate.of(2022, 12, 30), "mary@gmail.com"));
    staffs.add(new Staff("John", LocalDate.of(2024, 1, 20), "john@gmail.com"));
    staffs.add(new Staff("Alex", LocalDate.of(2010, 1, 1), "alex@gmail.com"));
    // Find the staffs, who are with 10+ exp, and then print out their email address.
    staffs.stream() //
        .filter(staff -> staff.yearOfExp() > 10) //
        .map(staff -> staff.getEmail()) // Stream<String>
        .forEach(email -> {
          System.out.println("Email address: " + email);
        });
    // Email address: alex@gmail.com

    // Collections.sort() -> Comparator
    // You can use "->" to create an object, when you have an interface with 1 abstract method only.
    Comparator<Staff> sortByYearOfExp =
        (staff1, staff2) -> staff1.yearOfExp() < staff2.yearOfExp() ? -1 : 1;
    
    // sort() - Stream
    List<String> emails = staffs.stream() //
        .sorted(sortByYearOfExp) //
        .map(s -> s.getEmail()) //
        .collect(Collectors.toList());
    System.out.println(emails); // [john@gmail.com, mary@gmail.com, alex@gmail.com]
    
    // Stream - filter + count
    long result =
        staffs.stream().filter(s -> s.getEmail().length() > 10).count();
    System.out.println(result);

    long result2 = staffs.stream() //
        .map(s -> {
          System.out.println(s.getEmail()); 
          // ! print out? NO, because map() won't affect result of count. 
          // ! So the process won't trigger the logic of map().
          return s.getEmail();
        }).count();
    System.out.println(result2); // 3

    // ! Stream -> terminal operation (collect, count, foreach, etc)
    // which intermediate operation affect result

    // Create Stream Object
    Stream<Integer> integers = Stream.of(3, 100, -2);
    Stream<Staff> staffs2 = Stream.empty(); // new ArrayList<>()

    // Given: List<String>, Vincent, Lucas, Oscar
    // Output: List<Dog>, assume all dogs are at age 1
  }

  public static class Staff {
    private String name;
    private LocalDate joinDate;
    private String email;

    public Staff(String name, LocalDate joinDate, String email) {
      this.name = name;
      this.joinDate = joinDate;
      this.email = email;
    }

    public String getEmail() {
      return this.email;
    }

    // Presentation of joinDate
    // Area is a presentation of circle radius
    // BMI is a presentation of Person height and weight
    public int yearOfExp() {
      return LocalDate.now().getYear() - this.joinDate.getYear();
    }
  }


  public static class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public int getAge() {
      return this.age;
    }

    public String getName() {
      return this.name;
    }

    @Override
    public String toString() {
      return "Dog(" + "name=" + this.name + ",age=" + this.age + ")";
    }
  }
}