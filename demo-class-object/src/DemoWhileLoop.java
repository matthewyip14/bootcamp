public class DemoWhileLoop {
  public static void main(String[] args) {
    // Alternative - for loop
    //! Don't use i,j,k as local variable name in any method
    for (int i = 0; i < 5; i++) {
      System.out.println("hello");
    }

    int count = 5;
    while (count > 0) { // 5,4,3,2,1
      System.out.println("hello");
      count--;
    }

    // ! Difference
    // 1. while: flexible for modifiers (conditional); for: standard writing code style
    // 2. while: flexible for break;  
  }
}
