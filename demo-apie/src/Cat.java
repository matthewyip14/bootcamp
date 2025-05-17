//! Cat is a kind of "Animal"
//! After "extends", cat is a child class, while Animel is a parent class
//! 1. Inherit all attributes from Parent class
//! 2. Cannot interit constructor from Parent class, but we can call the Parent's constructor by "super"
//! 3. Inherit instance method from Parent (NOT exactly inherit)
public class Cat extends Animal{
  // private int age;
  private String name;

  public Cat(int age) {
    super(age);
  }

  public Cat(String name, int age) {
    super(age);
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public int getAge() {
    return super.getAge() + 10;
  }
  public int getAge2() {
    return super.getAge();
  }

  public static void main(String[] args) {
    Cat cat = new Cat("John", 13);
    System.out.println(cat.getAge()); // 23
    System.out.println(cat.getAge2()); // 13
    System.out.println(cat.getName()); // John
    
  }
}
