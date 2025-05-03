public class Employee { // An employee has name, age and email
  // Attributes
  private String varName;
  private int varAge;
  private String varEmail;

  public void setName(String name) {
    this.varName = name;
  }
  public String getName() {
    return this.varName;
  }
  public void setAge(int age){
    this.varAge = age;
  }
  public int getAge() {
    return this.varAge;
  }
  public void setEmail(String email) {
    this.varEmail = email;
  }
  public String getEmail() {
    return this.varEmail;
  }

  public void pii(String name, String email, int age){
    this.varName = name;
    this.varEmail = email;
    this.varAge = age;
  }
  // Runtime
  public static void main(String[] args) {
    //String employee1Name = "John";
    //int employee1Age = 26;
    //String employee1Email = "john@gmail.com";

    //String employee2Name = "Steven";
    //int employee2Age = 30;
    //String employee2Email = "steven@gmail.com";

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

    Employee e3 = new Employee();
    e3.pii("Peter", "peterchan@gmail.com", 18);
    System.out.println(e3.getName());
    System.out.println(e3.getEmail());
    System.out.println(e3.getAge());





  }
}
