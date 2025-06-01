import java.util.Arrays;

public class DemoSorting {
  public static void main(String[] args) {
    Integer[] arr = new Integer[] {3, 7, -1, -80};
    // bubble sort (nested for loop) -> we don't use it in real life.
     Arrays.sort(arr);
     System.out.println(Arrays.toString(arr));

     // custom ordering -> but the performace would be "same" as Arrays.sort()
    Arrays.sort(arr, new SortedByIntegerDesc());
    System.out.println(Arrays.toString(arr));



    
  }
}
