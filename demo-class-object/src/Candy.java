public class Candy {
  private static int counter = 0;
  // candy has color, number
  private String color;
  private int number;

  //....
  public Candy(String color, int number) {
    counter++;
    this.color = color;
    this.number = number;
  }

  // getter
  public String getColor() {
    return this.color;
  }
  public int getNumber() {
    return this.number;
  }
  public static int getCounter() {
    return counter;
  } 
  public static void main(String[] args) {
    System.out.println(counter);



    // Disburibute 20 candy to 3 Students
    // Every Student has his own candies.
    // print out the candy (color, number) of every students
    
    // Use loop to distribute candy

    // Teacher.java -> distribute
    // Student -> receive(Candy candy)

  }
}
