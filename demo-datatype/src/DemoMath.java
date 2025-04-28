public class DemoMath {
  public static void main(String[] args) {
    // pow
    // 2^4 = 16
    double result = Math.pow(2.0, 4.0);
    System.out.println(result); // 16.0

    int x = 3;
    int y = 7;
    System.out.println(Math.abs(x - y));

    System.out.println(Math.round(9.45)); // 9, rounding down
    System.out.println(Math.sqrt(81)); // 9.0

    System.out.println(Math.max(9, 3)); // 9
    System.out.println(Math.max(3, 9)); // 9

    System.out.println(Math.min(2, 8)); // 2
    System.out.println(Math.min(8, 2)); // 8
  }
}
