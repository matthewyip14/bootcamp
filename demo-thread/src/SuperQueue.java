import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SuperQueue {
  private Stack<String> s1;
  private Stack<String> s2;

  public SuperQueue() {
    this.s1 = new Stack<>();
    this.s2 = new Stack<>();
  }
  public void add(String element) {
    // ! step 1: loop move to 2nd stack
    // ! step 1: put the element into 1st stack
    // ! step 1: loop move back to 1st stack
  }
  // 2 Stack to implement SuperQueue (same as Queue, add(), )
  // 1. add
  // 2. poll
  // 3. size
  // 4. isEmpty

  public static void main(String[] args) {
    Queue<String> q1 = new LinkedList<>();
    q1.add("John");
    q1.add("Peter");
    q1.add("Oscar");
    System.out.println(q1.poll()); // Oscar
    System.out.println(q1.size()); 
    System.out.println(q1.isEmpty());
  }
}
