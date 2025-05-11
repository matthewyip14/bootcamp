public class Student {
  private String name;
  private Candy[] candies;

  // Constructor
  public Student(String name) {
    this.name = name;
    this.candies = new Candy[0];
  }
  public String getName() {
    return this.name;
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
  public static void main(String[] args) {
    Candy[] candies = new Candy[20];
    System.out.println(Candy.getCounter());
    for (int i = 0; i < candies.length; i++ ) {
      candies[i] = new Candy("Pink", i + 1);
    }
    System.out.println(Candy.getCounter());  
    
    Student[] s = new Student[3];
    s[0] = new Student("X");
    s[1] = new Student("Y");
    s[2] = new Student("Z");
    System.out.println(s[0].getName());

    while (Candy.counter > 0) {
    for (int i = 0; i < Candy.getCounter(); i++) {
      //System.out.println(i % 3);
      s[i % 3].add(candies[i]);
      System.out.println(s[i % 3].getName()
      +", "+ candies[i].getColor()
      +", "+ candies[i].getNumber());
      }
      Candy.counter--;
    }
    System.out.println(Candy.counter);
  }
}
