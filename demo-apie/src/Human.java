public abstract class Human {
  private String name;

  public Human(String name) {
    this.name = name;
  }

  public void speak() {
    System.out.println("Speaking ...");
  }

  // abstract method
  public abstract void walk();
}
