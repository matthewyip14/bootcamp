import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class Shape {
  public abstract double area();

  public static <T extends Shape> double totalArea(List<T> Shape) {
    return -1;
  }

  public static double totalArea2(List<Shape> Shape) {
    return -1;
  }
  // Cricle, Rectangular
  public static void main(String[] args) {
    List<Shape> shapes = new LinkedList<>();
    shapes.add(new Cricle());
    shapes.add(new Cricle());
    shapes.add(new Rectangular());

    List<Circle> circles = new ArrayList<>();
    circles.add(new Cricle());
    circles.add(new Circle());

    List<Rectangular> rectangulars = new ArrayList<>();
    rectangulars.add(new Rectangular());
    rectangulars.add(new Rectangular());

    
    Shape.totalArea(null); // List<Circle>, List<Rectangular>, List<Shape>
    Shape.totalArea2(null); // List<Shape>
  }
}

