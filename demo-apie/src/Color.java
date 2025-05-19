// ! enum
// ! When you execute the main method, JVM create enum objects (Color.RED, Color.BLUE) for you automatically
// RED and BLUE are 2 different and globally unique objects
// ! Drop down list
// ! 1. Finite number of values
// ! 2. NOT usually changes (add/remove) -> program change
public enum Color {
  // private String value; // RED, BLUE, ...
  RED, BLUE,;
  //public Color(String value) {
  //  this.value = value;
  //}


  public static void main(String[] args) {
    //System.out.println(new Color("RED"));
    //System.out.println(new Color("RED"));
  }
}
