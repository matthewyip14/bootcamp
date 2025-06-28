import java.util.List;
import java.util.Vector;


public class DemoArrayList {
  public static void main(String[] args) {
    // Problem: ArrayList's behavior is not atomic
    // Solution: Vector
    // ! For Data structure, we can just change the implementation (Polymorphism)
    List<Integer> integers = new Vector<>();
    // Task add 1 int list 100_000 times
    
    Runnable task = () ->{
      for (int i = 0; i < 100_000; i++) {
        integers.add(1);
      }
    };
    long before = System.currentTimeMillis();

    Thread worker1 = new Thread(task);
    Thread worker2 = new Thread(task);

    worker1.start();
    worker2.start();

    try {
      worker1.join();
      worker2.join();
    } catch(InterruptedException e) {

    }
    long after = System.currentTimeMillis();
    // ! For "time used", Vector has lower performance, because all of its behavior/method are synchronized
    // ! ArrayList has error. Because underlying data structure is array, so the copy array process may hit error.
    System.out.println("time used: " + (after - before));
    System.out.println(integers.size()); // < 200000 if the object is arraylist
  }
}
