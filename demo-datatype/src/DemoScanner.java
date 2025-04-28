import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input a number:");
    int input = scanner.nextInt();
    
    
    String s = ""; // Even or ODD
    if( input % 2 == 0 ) {
      s = "EVEN";
    } else {
      s = "ODD";
    }
    System.out.println("The input is " + s + " number.");










  }
}
