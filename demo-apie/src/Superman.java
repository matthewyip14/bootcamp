public class Superman extends Human implements Flyable, Living {

  public Superman(String name) {
    super(name);
  }

  @Override
  public void fly() {
    System.out.println("I am flying ...");
  }

  @Override
  public void eat() {
    System.out.println("I am eating ...");
  }

  @Override
  public void drink() {
    System.out.println("I am drinking ...");
  }

  @Override
  public void walk() {
    System.out.println("Superman is walking ....");
  }

  // ! You can override or NOT override speak()
  @Override
  public void speak() {
    System.out.println("Superman is speaking ....");
  }

  public static void main(String[] args) {
    Superman s1 = new Superman("John");
    s1.fly();
    s1.eat();
    s1.walk();
    s1.speak();
    s1.drink();

    Flyable something = new Superman("Peter");
    something.fly(); // Polymorphism
    
    // Hide the method of eat() and drink()
    // something.eat();
    // something.drink();

    Superman s2 = (Superman) something;
    s2.eat();
    s2.walk();
    s2.drink();
    s2.speak();

    Living s3 = new Superman("Steven");
    s3.eat();
    s3.drink();
    // s3.fly();
    // s3.walk();
  }
}