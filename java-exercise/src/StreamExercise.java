import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExercise {
  public record Person(String name, int age) {}
  public record Staff(String name, Gender gender) {}
  public record Product(String name, int price) {}
  public record Worker(String name, String department) {}
  public record Children(String name, int score) {}
  public enum Gender { Male, Female,;}

  // public  Boolean isMale(){
  //   if Gender.Male = true;
  // }
  public static void main(String[] args) {
    // 1. Basic Stream Operations
    // Task: Given a list of integers, use a stream to find all the even numbers, square them, and then
    // sort the result in descending order.
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> numbers1 = numbers.stream()
      .filter(n -> n % 2 == 0)
      .map(n -> n * n)
      .sorted(Collections.reverseOrder())
      .collect(Collectors.toList());
    System.out.println(numbers1); // [100, 64, 36, 16, 4]
    // Output: [100, 64, 36, 16, 4]

    // 2. Filtering and Collecting
    // Task: Given a list of names, filter the names that start with "A" and collect them into a list.
    List<String> names =
        Arrays.asList("Alice", "Bob", "Annie", "David", "Alex");
    List<String> names1 = names.stream()
      .filter(N -> N.startsWith("A"))
      .collect(Collectors.toList());
    System.out.println(names1); // [Alice, Annie, Alex]
    // Output: [Alice, Annie, Alex]

    // 3. Finding Maximum and Minimum
    // Task: Given a list of integers, find the maximum and minimum values using Streams.
    List<Integer> numbers2 = Arrays.asList(10, 20, 5, 30, 15);
    int maxValue = numbers2.stream().max(Comparator.naturalOrder()).orElseThrow();
    System.out.println("Max: " + maxValue); // Max: 30
    // Output: Max: 30
    int minValue = numbers2.stream().min(Comparator.naturalOrder()).orElseThrow();
    System.out.println("Min: " + minValue); // Min: 5
    // Output: Min: 5

    // 4. Mapping to a List of Lengths
    // Task: Given a list of strings, map each string to its length and collect the lengths into a
    // List<Integer>
    List<String> words = Arrays.asList("apple", "banana", "pear");
    List<Integer> wordsOfLength = words.stream()
      .map(w -> w.length())
      .collect(Collectors.toList());
    System.out.println(wordsOfLength); // [5, 6, 4]
    // Output: [5, 6, 4] (List)

    // 5. Counting Elements
    // Task: Given a list of strings, count how many strings have a length greater than 3.
    List<String> words2 = Arrays.asList("hi", "hello", "world", "java", "stream");
    long count = words2.stream()
      .filter(W -> { 
        return W.length() > 3;
      }).count();
    System.out.println(count); // 4
    // Output: 4

    // 6. Filtering and Collecting to a Set
    // Task: Given a list of numbers, filter out all numbers greater than 10 and collect them into a
    // Set.
    List<Integer> numbers3 = Arrays.asList(5, 10, 15, 20, 10, 5);
    Set<Integer> n3 = numbers3.stream()
      .filter(U -> U > 10)
      .sorted(Comparator.naturalOrder())
      .collect(Collectors.toSet());
    System.out.println(n3); // [20, 15]
    // // Output: [15, 20]

    // 7. Mapping to a Map (Key-Value Pairs)
    // Task: Given a list of students with their names and scores, map them to a Map<String, Integer>,
    // where the key is the student's name and the value is their score.

    // Create Student Class
    // new Student("Alice", 85)
    // new Student("Bob", 75)
     
    List<Student> students = new ArrayList<>();
    students.add(new Student("Alice", 85));
    students.add(new Student("Bob", 75));
   
    Map<String, Integer> s2 = students.stream()
      .collect(Collectors.toMap(st -> st.getName(), st -> st.getScore()));
      // .collect(Collectors.toMap(Student::getName, Student::getScore));
    System.out.println(s2); // {Bob=75, Alice=85}
    // Output: {Alice=85, Bob=75}

    // 8. Filtering and Mapping to a List of Objects
    // Task: Given a list of Employee objects, filter out employees with a salary less than 50,000 and
    // map them to a list of their names.

    // Create Employee Class
    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee("John", 65000));
    employees.add(new Employee("Jane", 55000));
    employees.add(new Employee("Doe", 40000));
    // new Employee("John", 65000)
    // new Employee("Jane", 55000)
    // new Employee("Doe", 40000)
    List<String> employees2 =employees.stream()
      .filter(e -> e.getSalary() > 50000)
      .map(e -> e.getName())
      .collect(Collectors.toList());
    System.out.println(employees2); // [John, Jane]
    // Output: [John, Jane]

    // 9. Grouping and Collecting to a Map (Group by Age)
    // Task: Given a list of people with their names and ages, group them by age and collect the result
    // into a Map<Integer, List<String>> where the key is the age and the value is a list of names.

    // Create Person Class
    List<Person> persons = List.of(
    new Person("Alice", 30),
    new Person("Bob", 25),
    new Person("Charlie", 30));
    // new Person("Alice", 30),
    // new Person("Bob", 25),
    // new Person("Charlie", 30)

    Map<Integer, List<String>> persons2 = persons.stream()
      .collect(Collectors.groupingBy(P1 -> P1.age(),
       Collectors.mapping(P1 -> P1.name(), 
       Collectors.toList())));
    System.out.println(persons2); // {25=[Bob], 30=[Alice, Charlie]}
    // Output: {30=[Alice, Charlie], 25=[Bob]} (Map)

    // 10. Partitioning and Collecting to a Map (Partition by Gender)
    // Task: Given a list of Staff with their names and genders, partition them into two groups: male
    // and female, and collect the result into a Map<Boolean, List<Person>>.

    // Create Staff Class
    List<Staff> staffs = List.of(
    new Staff("Alice", Gender.Female),
    new Staff("Bob", Gender.Male),
    new Staff("Charlie", Gender.Male));
    // new Staff("Alice", Gender.Female)
    // new Staff("Bob", Gender.Male)
    // new Staff("Charlie", Gender.Male)
    Map<Boolean, List<String>> staffs2 = staffs.stream()
      .collect(Collectors.partitioningBy(S -> S.gender() == Gender.Male,
      Collectors.mapping(S -> S.name(), 
      Collectors.toList())));
    System.out.println(staffs2); // {false=[Alice], true=[Bob, Charlie]}
    // Output: {false=[Alice], true=[Bob, Charlie]} (Map)

    // 11. Filtering, Mapping, and Collecting to a List
    // Task: Given a list of integers, filter out numbers less than 10, multiply the remaining numbers
    // by 2, and collect the result into a List.

    List<Integer> numbers4 = Arrays.asList(5, 15, 20, 7, 30);
    List<Integer> N4 = numbers4.stream()
      .filter(n -> n > 10)
      .map(n -> n * 2)
      .collect(Collectors.toList());
    System.out.println(N4);
    // Output: [30, 40, 60]

    // 12. Mapping to a Custom Object and Collecting to a List
    // Task: Given a list of names and a constant default value, map each name to a Person object (name
    // and default value for age) and collect the result into a list.

     List<String> names2 = Arrays.asList("Alice", "Bob", "Charlie");
     int defaultAge = 30;
     List<Person> persons3 = names2.stream()
      .map(name -> new Person(name, defaultAge))
      .collect(Collectors.toList());
    System.out.println(persons3); // [Person[name=Alice, age=30], Person[name=Bob, age=30], Person[name=Charlie, age=30]]

    // Output: [Person(name=Alice, age=30), Person(name=Bob, age=30), Person(name=Charlie, age=30)]

    // 13. Mapping and Collecting to a Deque
    // Task: Given a list of words, map each word to its uppercase form and collect the result into a
    // Deque.

    List<String> words3 = Arrays.asList("hello", "world", "java");
    Deque<String> words4 = words3.stream()
      .map(w -> w.toUpperCase())
      .collect(Collectors.toCollection(() -> new ArrayDeque<>()));
    System.out.println(words4); // [HELLO, WORLD, JAVA]
      // Output: [HELLO, WORLD, JAVA] (Deque)

    // 14. Transforming and Collecting to an Array
    // Task: Given a list of integers, square each number and collect the result into an array.

    List<Integer> numbers7 = Arrays.asList(1, 2, 3, 4);
    ArrayList<Integer> numbers6 = numbers7.stream()
      .map(NU -> NU * NU)
      .collect(Collectors.toCollection(() -> new ArrayList<>()));
    System.out.println(numbers6);
    // Output: [1, 4, 9, 16]

    // 15. Map and Reduce
    // Task: Given a list of products with their prices, use the map and reduce methods to calculate the
    // total price of all products.

    // Create Product Class
    List<Product> products = List.of(
    new Product("Book", 10),
    new Product("Pen", 5),
    new Product("Notebook", 7));
    // new Product("Book", 10)
    // new Product("Pen", 5)
    // new Product("Notebook", 7)

    int totalPrice = products.stream()
      .map(p -> p.price())
      .reduce(0, Integer::sum);
    System.out.println(totalPrice);
    // Output: 22

    // 16. Grouping
    // Task: Given a list of employees with their department names, use groupingBy method to group the
    // employees by department.

    // Create Worker Class
    List<Worker> workers = List.of(
    new Worker("Alice", "HR"),
    new Worker("Bob", "IT"),
    new Worker("Charlie", "HR"),
    new Worker("David", "IT"));
    // new Worker("Alice", "HR")
    // new Worker("Bob", "IT")
    // new Worker("Charlie", "HR")
    // new Worker("David", "IT")

    Map<String, List<String>> sortedByDept = workers.stream()
       .collect(Collectors.groupingBy(w -> w.department(),
       Collectors.mapping(w -> w.name(),
       Collectors.toList())));
    System.out.println(sortedByDept);
    // Output: {HR=[Alice, Charlie], IT=[Bob, David]}

    // 17. Parallel Streams
    // Task: Given a list of numbers, use a parallel stream to calculate the sum of all elements.
    List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
      int sum = numbers5.parallelStream()
        .reduce(0,Integer::sum);
    System.out.println(sum);
    // Output: 55


    // 18. FlatMap
    // Task: Given a list of lists of numbers, flatten them into a single list and filter only the
    // numbers greater than 5.

    List<List<Integer>> listOfIntegers = Arrays.asList( //
        Arrays.asList(1, 2, 3), //
        Arrays.asList(4, 5, 6), //
        Arrays.asList(7, 8, 9) //
    );
    // Output: [6, 7, 8, 9]
    List<Integer> greaterThan5 = listOfIntegers.stream()
      .flatMap(List::stream)
      .filter(n -> n > 5)
      .collect(Collectors.toList());
    System.out.println(greaterThan5);
    
    // 19. Distinct and Sorting
    // Task: Given a list of strings with some duplicates, remove the duplicates and return the result
    // in alphabetical order.

    List<String> fruits =
        Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
    // Output: [apple, banana, grape, orange]
    List<String> fruits2 = fruits.stream()
      .distinct()
      .sorted()
      .collect(Collectors.toList());
    System.out.println(fruits2); 
    // 20. Partitioning By
    // Task: Given a list of Childrens with their scores, partition the Childrens into passing and
    // failing
    // groups (pass if score >= 50).
    // Create Student first.

    // Create Children Class
    List<Children> childrens = List.of(
      new Children("Alice", 45),
      new Children("Bob", 55),
      new Children("Charlie", 40),
      new Children("David", 70));
    // new Children("Alice", 45)
    // new Children("Bob", 55)
    // new Children("Charlie", 40)
    // new Children("David", 70)

    Map<Boolean, List<String>> sortedByPass = childrens.stream()
      .collect(Collectors.partitioningBy(
        c1 -> c1.score() >= 50,
        Collectors.mapping(c1 -> c1.name(),
        Collectors.toList())));
    System.out.println(sortedByPass); 
    // Output: {false=[Alice, Charlie], true=[Bob, David]}

    // 21. Joining Strings
    // Task: Given a list of words, join them into a single string separated by commas.

    List<String> languages = Arrays.asList("Java", "Python", "Rust", "R", "Go");
    String sentence = languages.stream()
      .collect(Collectors.joining(", "));
    System.out.println(sentence);
    // Output: "Java, Python, Rust, R, Go"

    // 22. Find First and Any
    // Task: Given a list of integers, find the first number that is divisible by 3.
    List<Integer> ages = Arrays.asList(4, 7, 9, 12, 16, 21);
    Optional<Integer> number8 = ages.stream()
      .filter(a -> a % 3 == 0)
      .findFirst();
    System.out.println(number8);
    // Output: 9

    // 23. Limit and Skip
    // Task: Given a list of numbers, skip the first 3 elements and return the next 5 elements.

    List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> newElements = elements.stream()
      .skip(3)
      .limit(5)
      .collect(Collectors.toList());
    System.out.println(newElements);
    // Output: [4, 5, 6, 7, 8]

    // 24. Peek
    // Task: Given a list of integers, double each element and use the peek method to log the
    // intermediate results to the console.

    List<Integer> amounts = Arrays.asList(1, 2, 3, 4);
    List<Integer> doubled = amounts.stream()
      .map(a -> a * 2)
      .peek(a -> System.out.println(a))
      .collect(Collectors.toList());
    System.out.println(doubled);
    // Intermediate output: 2, 4, 6, 8
    // Final Output: [2, 4, 6, 8]

    // 25. Optional and Streams
    // Task: Given a list of strings, use Streams to find the first string longer than 4 characters.
    // Handle the case where no such string exists using Optional.

    List<String> animals = Arrays.asList("cat", "tiger", "panda", "dog");
    Optional<String> nameLongerThan4 = animals.stream()
      .filter( n -> n.length() > 4 )
      .findFirst();
    System.out.println(nameLongerThan4);
    
    // Output: Optional[tiger]

    List<String> animals2 = Arrays.asList("cat", "dog", "bird");
    Optional<String> nameLongerThan4Again = animals2.stream()
      .filter( n -> n.length() > 4 )
      .findFirst();
    System.out.println(nameLongerThan4Again);
    // Output: Optional.empty

    // 26. Custom Collector
    // Task: Create a custom collector that collects the elements of a stream and remove all duplicates

    List<Integer> duplicates = Arrays.asList(2, 1, 2, 3, 4, 3, 5, 5, 6);
    Collector<Integer, Set<Integer>, Set<Integer>> customCollector = 
      Collector.of(
       () -> new TreeSet<Integer>(),
        (set, element) -> set.add(element),
        (left, right) -> {
          left.addAll(right);
          return left;
        }
      );

    Set<Integer> result = duplicates.stream()
        .collect(customCollector);
    System.out.println(result);

    List<Integer> sortedUnique = duplicates.stream()
        .distinct()
        .sorted()
        .collect(Collectors.toList());
    System.out.println(sortedUnique);
    // Output: [1, 2, 3, 4, 5, 6] (Set)

    // 27. String Length Calculation
    // Task: Given a list of strings, calculate the total number of characters in all the strings
    // combined.

    List<String> keywords =
        Arrays.asList("stream", "filter", "map", "sorted", "collect");
    int totalLength = keywords.stream()
      .mapToInt(s -> s.length())
      .sum();
    System.out.println(totalLength);

    // Output: 28
  }
}
