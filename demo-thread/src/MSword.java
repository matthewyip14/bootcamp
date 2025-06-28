import java.util.List;
import java.util.Stack;

// Stack

public class MSword {
  private Stack<String> undoStack;
  private Stack<String> redoStack;
  
  // constructor
  public MSword() {
    this.undoStack = new Stack<>();
    this.redoStack = new Stack<>();
  }
  
  public void undo() {
    if (!undoStack.isEmpty()) {
      String element = undoStack.pop();
      redoStack.push(element);
    }
  }

  public void redo() {
    if (!redoStack.isEmpty()) {
      String element = redoStack.pop();
      undoStack.push(element);
    }
  }

  public void addWord(String word) {
    this.undoStack.push(word);
  }
  public List<String> getWords() {
    return this.undoStack;
  }
  public static void main(String[] args) {
    MSword mSword = new MSword();
    mSword.addWord("John");
    mSword.addWord("Peter");
    mSword.undo();
    System.out.println(mSword.getWords());
  }
}
