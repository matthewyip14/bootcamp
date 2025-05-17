import java.math.BigDecimal;

public class Circle1 extends Shape {
  private double radius;

  public Circle1(double radius, String color) {
    super(color);
    this.radius = radius;
  }

  @Override
  public double area() {
    return BigDecimal.valueOf(this.radius)
        .multiply(BigDecimal.valueOf(this.radius)) //
        .multiply(BigDecimal.valueOf(Math.PI)) //
        .doubleValue();
  }

  public static void main(String[] args) {
    Object o1 = new Object();
    Object o2 = new Object();
    Object o3 = o1;
  
    // Object.class has equals(), hashCode(), toString()
    // ! 1. equals()
    System.out.println(o1.equals(o2)); // false
    System.out.println(o1.equals(o3)); // true
    // ! 2. hashCode()
    System.out.println(o1.hashCode()); // 2018699554
    System.out.println(o2.hashCode()); // 1311053135
    System.out.println(o3.hashCode()); // 2018699554
    // ! 3. toString()
    System.out.println(o1.toString()); // java.lang.Object@7852e922
    System.out.println(o2.toString()); // java.lang.Object@4e25154f
    System.out.println(o3.toString()); // java.lang.Object@7852e922

    Card c1 = new Card('A', 'D');
    Card c2 = new Card('A', 'D');
    System.out.println(c1.equals(c2)); // false, because it is using Object.equals(), we do not override.
    // ! Object.equals() is checking address
    // true, if you re-define Card.equals()

    // The definition of hashCode() always same as equals()
    System.out.println(c1.hashCode()); // 3044
    System.out.println(c2.hashCode()); // 3044

    System.out.println(c1); // Card(rank=A,suit=D)
    System.err.println(c2); // Card(rank=A,suit=D)
    System.out.println(c1 == c2); // false

    String s1 = new String("hello");
    String s2 = new String("hello");
    System.out.println(s1.equals(s2)); // true
    System.out.println(s1.compareTo(s2)); // 0
    System.out.println(s1.compareTo("abcde")); // 7 (h vs a)
    Integer x = 10;
    System.out.println(x.equals(10)); // true
    System.out.println(x.compareTo(8)); // 1
  }
}