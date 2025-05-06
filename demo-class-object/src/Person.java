import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {
  // height, weight
  private double height;
  private double weight;
  

  
  public Person(double height, double weight) {
    this.height = height;
    this.weight = weight;
  }

  //! methods:
  // BMI -> double
  public double calculateBMI() {
    double bmi = BigDecimal.valueOf(this.weight).divide(BigDecimal.valueOf(Math.pow(this.height, 2.0)), 2, RoundingMode.HALF_UP).doubleValue();
    return bmi;
  }
  
  public boolean isOverWeight() {
   double bmi = calculateBMI();
   return bmi > 25;
   }
    
  // isOverweight -> boolean (bmi > 25)

  // main
  // person[] -> p1, p2, p3
  // for loop () -> array -> print out the bmi and their weight status
  public static void main(String[] args) {
    Person[] person = new Person[3];
    person[0] = new Person(1.45, 100.0);
    person[1] = new Person(1.80, 85.0);
    person[2] = new Person(1.60, 75.0);

    for (int i = 0; i < person.length; i++) {
      System.out.println(person[i].height);
      System.out.println(person[i].weight);
      System.out.println(person[i].calculateBMI());
      System.out.println("this person is overweight: " + person[i].isOverWeight());
    }
    
    
    
    
  }
}

