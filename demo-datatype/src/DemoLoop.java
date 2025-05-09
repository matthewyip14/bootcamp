public class DemoLoop {
  public static void main(String[] args) {
    int x = 2;
    x = x * 2;
    x = x * 2;
    // 2^3

    // 2^10
    //! For Loop
    // for (initialization; continue condition; modifier)
    // Step 1: i = 0
    // Step 2: check if i < 3
    // Step 3: if yes, print hello
    // Step 4: i + 1
    // Step 5: check if i < 3
    // Step 6: i + 1
    // Step 7: check if i < 3
    // Step 8: i + 1
    // Step 9: check if i < 3
    // Step 10: i + 1
    // Step 11: check if i < 3
    // Step 12; No -> exit loop
    for (int i = 0; i < 3; i++) { // i=0,1,2
      System.out.println("hello");
    }

    // 2^10
    int y = 2;
    for (int i = 0; i < 9; i++) {
      y = y * 2;
    } System.out.println(y);
    

    // for + if
    // print even numbers between 0 - 10
    for ( int i = 0; i < 11; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }

    // for + if
    // print the char index of 'm', if found, print the index; if not found, print -1
    String s3 = "bootcamp";
    int index = -1;
    for (int i = 0; i < s3.length(); i++) {
      if (s3.charAt(i) == 'm') {
        index = i;
      }
    }
    System.err.println(index);

    // break + loop
    // Find the first character of 'a' in a given String
    String str = "character";
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'a') {
        System.out.println(i); // 2
        break; // break the whole loop (stop the loop, exit the loop)
      }
    }

    // Find the first 3 character of 'a' in a given String
    String ss = "abcdeabcdeabcdeabcdeabcde";
    int counter = 0;
    for (int i = 0; i < ss.length(); i++) {
      if ( ss.charAt(i) == 'a' && counter < 3) { // 0,1,2
        System.out.println(i);
        counter++;

      }
    }

    String ss1 = "abcdeabcdeabcdeabcdeabcde";
    int counter1 = 0;
    for (int i = 0; i < ss1.length(); i++) {
      if ( ss1.charAt(i) == 'a') { // 0,1,2
        if (counter1 >= 3) {
          break;
        }
        System.out.println(i);
        counter1++;

      }
    }

    //! continue + loop
    // Print all index of character of 'a' in a give String
    String ss2 = "abcabcabc";
    for (int i = 0; i < ss2.length(); i++) {
      if (ss2.charAt(i) == 'a') {
        System.out.println(i);
      }
    }
    for (int i = 0; i < ss2.length(); i++) {
      if (ss2.charAt(i) != 'a') {
        continue; //skip the rest of code lines, and then goes to next iteration
      }
      System.out.println(i);
    }






  }
}
