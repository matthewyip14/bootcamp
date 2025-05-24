import java.util.ArrayList;

public class Study {
  public static void main(String[] args) {
    ArrayList<Dog> d1= new ArrayList<>();
    d1.add(new Dog("Mary"));
    d1.add (new Dog("Peter"));
    System.out.println(d1.size());
    d1.remove(new Dog("Peter"));

    d1.add(new Dog("Sam"));
    System.out.println(d1);
    System.out.println(d1.size());
    d1.add (new Dog("Peter"));
    //d1.add (new Dog("Peter"));
    //d1.add (new Dog("Peter"));
    d1.addFirst(new Dog("Ada"));
    d1.add(new Dog("Ada"));
    System.out.println(d1.indexOf("Ada"));

    int[][] arr2d = new int[][] {{1,2,3}, {7,8,9}, {10,1,2}};
for (int i = 0; i < arr2d.length; i++) {
    for (int j = 0; j < arr2d[i].length; j++) {
        System.out.println("row=" + i + ", col=" + j + ", val=" + arr2d[i][j]);
    }
}
    
    
  }
}
