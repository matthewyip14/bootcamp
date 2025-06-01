// ! Once the class extends RuntimeException, the class can be thrown or try-catch.
// ! RuntimeException -> Unchecked Exception (optional to handle)
// ! Exception -> Checked Exception (2 ways to handle: try-catch or throws)
// RuntimeException has getMessage()
public class StaffNotFoundException extends RuntimeException {

  public StaffNotFoundException(String message) {
    super(message);
  }
/**
 * 
 * 
 * 
 * 
 * 
 * 
 */
  
}
