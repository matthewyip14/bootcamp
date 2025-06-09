import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
  private String name;
  private int score;
        
  public Student(String name, int score) {
    this.name = name;
    this.score = score;
  }
  public String getName() {
    return this.name;
  }
  public int getScore() {
    return this.score;
  }
  // @Override
  //   public String toString() {
  //     return this.name + "=" = this.score;
  //   }

  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
    students.add(new Student("Alice", 85));
    students.add(new Student("Bob", 75));
    
    List<String> s1 = students.stream()
      .map(S -> S.getName() + "=" + S.getScore())
      .collect(Collectors.toList());
    System.out.println(s1);
  }
}
