public class Dog extends Animal {
  private double weight; // kg

  public Dog(double weight, int age) {
    super(age);
    this.weight = weight;
  }

  // Presentation
  // Getter
  public double getWeight() { // g
    return this.weight + 2;
  }

  @Override
  public int getAge() {
    return -99;
  }

  public static void main(String[] args) {
    Dog dog = new Dog(3.5, 10);
    System.out.println(dog.getWeight()); // 3.5
    System.out.println(dog.getAge()); // 10
  }
}