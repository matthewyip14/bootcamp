public abstract class Machine {
  private boolean isOn;

  public Machine() {
    this.isOn = false;
  }

  // getter
  public boolean isOn() {
    return this.isOn;
  }

  // ! Encapsulation
  // setter
  public void turnOn() {
    this.isOn = true;
  }

  public void turnOff() {
    this.isOn = false;
  }

  // abstract method
  public abstract String getStatus();

  public abstract void start();

  public abstract void stop();

  public static void main(String[] args) {
    Machine phone = new Phone(17.5);
    System.out.println(phone.getStatus()); // Phone status: off
    phone.start();
    phone.stop();
    Machine laptop = new Laptop(32);

    laptop.start();
    System.out.println(laptop.getStatus()); // Laptop status: ON
    laptop.stop();
    System.out.println(laptop.getStatus()); // Laptop status: OFF

    Phone p2 = new Phone(18.5);
    System.out.println(p2.getScreenSize()); // 18.5
    System.out.println(p2.getStatus()); // Phone status: OFF
    Laptop l2 = new Laptop(24);
    System.out.println(l2.getRam()); // 24
    System.out.println(l2.getStatus()); // Laptop status: OFF
  }
}