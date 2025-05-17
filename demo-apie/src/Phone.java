public class Phone extends Machine {
  private double screenSize;

  public Phone(double screenSize) {
    // super(); // ! implicitly calling parent class constructor
    this.screenSize = screenSize;
  }

  public double getScreenSize() {
    return this.screenSize;
  }

  @Override
  public void start() {
    System.out.println("Phone is starting ...");
  }

  @Override
  public void stop() {
    System.out.println("Phone is stoping ...");
  }

  @Override
  public String getStatus() {
    String status = super.isOn() ? "ON" : "OFF";
    return "Laptop status: " + status;
  }
}