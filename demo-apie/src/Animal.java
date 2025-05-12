// Interit
public class Animal {
  private int age;

  public Animal(int age) {
    this.age = age;
  }
  public int getAge() {
    return this.age;
  }

  public static void main(String[] args) {
    Animal animal = new Animal(13);
    Cat cat = new Cat();

  }  
}
