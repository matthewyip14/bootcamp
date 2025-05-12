public class Dog extends Animal{
  // age
  private double weight;

  public Dog(double weight, int age) {
    super(age);
    this.weight = weight;
  }
  public double getWeight() {
    return this.weight;
  }
  

  public static void main(String[] args) {
    Dog dog = new Dog(9.0, 10);
    System.out.println(dog.getWeight()); // 9.0
    System.out.println(dog.getAge()); // 10
  }
}
