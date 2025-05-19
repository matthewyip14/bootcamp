public class Car {
  private Color color;

  public Car(Color color) {
    this.color = color;
  }


  public static void main(String[] args) {
    Car c1 = new Car(Color.RED);
    Car c2 = new Car(Color.RED);
  }
}
