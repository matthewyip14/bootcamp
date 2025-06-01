// ! <T extends Animal>, means T can be Animal, or its child class.

public class AnimalHelper<T extends Animal> {
  private T animal;


  public void setAnimal(T animal) {
    this.animal = animal;
  }

  // In static method, the generic type of parameters is independent,
  // not referring to the class T.
  public static <T extends Animal> void walk(T animal) {
    animal.walk(); // polymorphism, becase "extends Animal" ensures object can call Animal methods
  }

  public static void main(String[] args) {
    AnimalHelper<Animal> animalHelper1 = new AnimalHelper<>();
    animalHelper1.setAnimal(new Bird());
    animalHelper1.setAnimal(new Dog("John"));

    AnimalHelper<Dog> animalHelper2 = new AnimalHelper<>();
    animalHelper2.setAnimal(new Dog("Peter"));

    AnimalHelper2 superHelper = new AnimalHelper2();
    superHelper.setAnimal(new Bird());
    animalHelper2.setAnimal(new Dog("John"));

    // static generic method
    AnimalHelper.walk(new Bird());

    


  }
}
