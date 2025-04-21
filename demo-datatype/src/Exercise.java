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


    int boo1 = 8;
        boolean isOverThan7 = boo1 < 7;
        System.out.println(isOverThan7);

    char lastName = '龍';
    System.err.println(lastName);

    int w = 0;
    w--;
    System.err.println(w); 
    --w;
    System.err.println(w);
    w = w - 1;
    System.err.println(w);
    w -= 1;
    System.err.println(w); 
    

    //20250421//
    //Studying if//
    int h = 10;
    if (h <= 10) {
      System.out.println("Bearfast time!");
    } else if (h > 10 && h <= 12) {
      System.out.println("brunch time!");
    } else {
      System.out.println("Lunch time");
    }
     
    // Gen z = age < 28
    // Millennials = age >= 29 && <= 44
    // Gen X = age > 45
    
    int age = 37;
    if (age < 29) {
      System.out.println("Gen Z");
    } else if (age >= 29 && age <= 44) {
      System.out.println("Millennials");
    } else {
      System.out.println( "Gen Z");
    }

    // for
    for (int i = 0; i < 3; i++) {
      System.out.println("whatsup");
    }
    // for + if
    for (int n = 1; n <11; n++) {
      if (n % 2 == 0) {
        System.out.println( n + " is even number" );
      } else {
        System.out.println( n + " is odd number" );
      }
    }

    for ( int age1 = 25; age1 < 51; age1++) {
      if (age1 < 29) {
        System.out.println(age1 + " is Gen Z");
      } else if ( age1 >= 29 && age1 <= 44 ) {
        System.out.println(age1 + " is Millennials");
      } else {
        System.out.println(age1 + " is Gen x");
      }
    }


  }
}
