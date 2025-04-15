public class Exercise {
  public static void main(String[] args) {
    byte b1 = 127 ;
    byte b2 = -128; 
    System.out.println(b1);
    System.out.println(b2);

    short s1 = 128;
    short s2 = 126;
    // byte b3 = s2; // s2 is short size even the number is ok to byte.
    byte b3 = (byte) s2;
    System.out.println(b3);
    System.out.println(s1/4*5);

    long l1 = 2_200_000_000L; // we need to add "L" behind of the number as the number is int (default)
    System.out.println(l1/2_000_000/b2);
    
    double d1 = 2.22223;
     d1 = d1 / 7;
    System.out.println(d1);

  }
}
