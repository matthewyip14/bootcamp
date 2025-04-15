public class DemoString {
  public static void main(String[] args) {
    // String is NOT primitive, which consist of a set of char values
    String s = "John";
    String s2 = "Dear Sir,";

    // 8 Primitives -> store values ONLY
    // Sting -> Store values + functions
    String s3 = "Steven";
    s3 = "Vincent";
    System.out.println(s3); // Vincent

    // Function 1: equals()
    System.out.println(s3.equals("Vincent")); // true
    System.out.println(s3.equals("vincent")); // false, case sensitive

    // Function 2: length()
    System.out.println(s3.length()); // 7

    // Function 3: charAt()
    // index starts with 0
    // index range 0-6, length=7
    System.out.println(s3.charAt(2)); // 'n', the char at position 3
    //System.out.println(s3.charAt(7)); // out of range
    //System.out.println(s3.charAt(-1)); // out of range

    // Question
    // print the last character of s3
    s3 = "Joey";
    //length(), charAt()
    System.out.println(s3.charAt(s3.length() - 1));

    // Find the middle character of name
    String name = "Joey";
    // Joey -> e
    System.out.println(name.charAt(name.length()/2));


    // Vincent -> c
    String name1 = "Vincent";
    System.out.println(name1.equals("Vincent"));
    System.out.println(name1.charAt(name1.length()/2));


  }
  
}
