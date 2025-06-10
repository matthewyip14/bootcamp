public class DemoRecord {
  public static void main(String[] args) {
    Staff staff1 = new Staff("John", 25);
    // Staff staff2 = new Staff();

    System.out.println(staff1.age()); // 25
    System.out.println(staff1.name()); // John

    // equals()
    Staff staff2 = new Staff("John", 25);
    System.out.println(staff1.equals(staff2)); // true
    
    // hashcode()
    System.out.println(staff1.hashCode()); // 71750734

    // toString()
    System.out.println(staff1.toString()); // Staff[name=John, age=25]
    System.out.println(staff1.nickname());
  }
}
