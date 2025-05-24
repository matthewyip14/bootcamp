import java.util.Arrays;

public class Book {
  public static void main(String[] args) {
  
    
        StringBuilder sb = new StringBuilder();

        // Appending strings
        sb.append("Hello");
        sb.append(" ");
        sb.append("World!");
        
        // Inserting a string at a specific position
        sb.insert(5, " java");

        // Deleting characters
        sb.delete(0, 6);

        // Updating characters
        sb.setCharAt(0, 'J');

        // Converting to a String
        String result = sb.toString();

        System.out.println(result); // Output: Java World!
    
  }
}
