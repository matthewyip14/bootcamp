// ! Java 16 record
public record Staff(String name, int age) {
  private static String animal = "Pig";
  // private String name;
  // private int age;

  // public Staff(String name, int age) {
  //   this.name = name;
  //   this.age = age;
  // }

  // public String getName() {
  //   return this.name;
  // }

  // public int getAge() {
  //   return this.age;
  // }

  // No Setter

  // Scenario: Get data from database, and then send it over to your client

  // customer instance method (Presentation)
  public String nickname() {
    return animal + " " + this.name; 
  }

  public static int sum(int x, int y) {
    return x + y;
  }
}