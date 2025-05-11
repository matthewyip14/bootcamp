public class Candy {
  private static int counter = 20;
  // candy has color, number
  private String color;
  private int number;

  //....
  public Candy(String color, int number) {
    
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
  //public int 
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
