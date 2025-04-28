public class Employee { // An employee has name, age and email
  // Attributes
  private String name;
  private int age;
  private String email;

  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return this.name;
  }
  public void setAge(int age){
    this.age = age;
  }
  public int getAge() {
    return this.age;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getEmail() {
    return this.email;
  }
  // Runtime
  public static void main(String[] args) {
    String employee1Name = "John";
    int employee1Age = 26;
    String employee1Email = "john@gmail.com";

    String employee2Name = "Steven";
    int employee2Age = 30;
    String employee2Email = "steven@gmail.com";

    // Solution - Class and Object
    Employee e1 = new Employee();
    e1.setName("John");
    System.out.println(e1.getName());
    Employee e2 = new Employee();
    e2.setName("Sally");
    System.out.println(e2.getName());
    e1.setAge(26);
    System.out.println(e1.getAge());
    e2.setAge(30);
    System.out.println(e2.getAge());
    e1.setEmail("john@gmail.com");
    System.out.println(e1.getEmail());
    e2.setEmail("steven@gmail.com");
    System.out.println(e2.getEmail());

    System.out.println(e1.getAge()+ e2.getAge());





  }
}
