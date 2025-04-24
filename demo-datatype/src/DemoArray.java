public class DemoArray {
  public static void main(String[] args) {
    // problem
    int x = 2;
    int x2 = 8;
    int x3 = 1000;
    System.err.println(x); // 2
    System.err.println(x2); // 8
    System.err.println(x3); // 1000

    // Array
    //! Store a set of same type of values 
    //For example, a set of int values
    // 3 -> three places to store int values
    int[] arr = new int[3];
    // write value into array
    // 0 represents the first place of the array
    arr[0] = 2;
    arr[1] = 8;
    arr[2] = 1000;
    // arr[3] = 10; // error, array length 3, so you cannot access the 4th places

    //! read value from array
    System.out.println(arr[0]); // 2
    System.out.println(arr[1]); // 8
    System.out.println(arr[2]); // 1000

    // declare double array -> 4 values
    // 1.1, 9.2, -9.8, 77.9
    // print them out
    double[] arr1 = new double[4];
    arr1[0] = 1.1;
    arr1[1] = 9.2;
    arr1[2] = -9.8;
    arr1[3] = 77.9;
    System.out.println(arr1[0]); // 1.1
    System.out.println(arr1[1]); // 9.2
    System.out.println(arr1[2]); // -9.8
    System.out.println(arr1[3]); // 77.9



  }
}
