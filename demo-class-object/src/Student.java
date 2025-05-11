public class Student {
  private String name;
  private Candy[] candies;

  // Constructor
  public Student(String name) {
    this.name = name;
    this.candies = new Candy[0];
  }

  // Menthod
  public void add(Candy newCandy) {
    Candy[] newCandies = new Candy[this.candies.length + 1];
    for (int i = 0; i < this.candies.length; i++) {
      newCandies[i] = candies[i];
    }
    newCandies[newCandies.length - 1] = newCandy;
    this.candies = newCandies;
  }
  // Disburibute 20 candy to 3 Students
  for (int i = 0, i < )





}
