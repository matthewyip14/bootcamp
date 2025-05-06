public class DemoOperator {
  //main
  public static void main(String[] args) { //main
    // +,-,*,/,%
    int x = 3;
    x = 6 + 9;

    int y = 5 + x - 10;
    System.out.println(y); // 10

    // 9 * 2 first
    int a = y - 9 * 2;
    System.out.println(a); // -8
    
    int b = (y - 9) * 2;
    System.out.println(b); // 2

    b = ((b - 10) + 2) * 2;
    System.out.println(b); 

    // divided by zero
    // int r = 10 / 0; // system error

    int r2 = 0 / 10;
    System.out.println(r2); // 0

    // Java: int / int -> int
    int r3 = 10 / 3;
    System.out.println(r3);

    // int / int -> int
    System.err.println(5 / 2); // 2
    // double / int -> double / double -> double
    System.err.println(5.0 / 2); // 2.5

    int score1 = 71;
    int score2 = 82;

    // code here...
    //(int + int) / int -> int
    //! (int + int) / double -> double
    //double averageScore = (score1 + score2 ) / 2; //! wrong
    double averageScore = (score1 + score2 ) / 2.0;
    System.err.println(averageScore); // 76.5

    //! big problem
    double d5 = 0.1 + 0.2;
    System.out.println(d5); //0.30000000000000004
    System.err.println(d5 + 0.1);

    //! remainder of 10 / 3 (餘數)
    int r8 = 10 % 3;
    System.out.println(r8); // 1

    int johnAge = 64;
    boolean isElderly = johnAge >= 65; //formula / definition
    System.out.println(isElderly); // false

    //boolean ismale = false

    // + 1 and - 1
    int t = 0;
    t++;
    ++t;
    t = t + 1;
    // "= t +" -> "+="
    t += 1;
    System.out.println(t); // 4

    int w = 0;
    w--;
    --w;
    w = w - 1;
    w -= 1;
    System.out.println(w); // -4

    // +/- non 1 value
    int o = 3;
    o -= 4;
    o += 4;
    System.out.println(o); // 3

    int q = 3;
    q = q * 3;
    q *= 3;
    System.out.println(q); // 27

    int v = 27;
    v /= 3;
    v = v / 3;
    System.out.println(v); // 3

    // Comparison
    // >, <, >=, <=, ==, !=
    int score = 91;
    boolean isGradeA = score >= 90;
    System.out.println(isGradeA); // true

    char gender = 'M';
    boolean isFemale = gender != 'M';
    System.out.println(isFemale); // true

  }
}
