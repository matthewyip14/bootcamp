public class Employee {
   // new Employee("John", 65000)
   // new Employee("Jane", 55000)
   // new Employee("Doe", 40000)
   private String name;
   private int salary;

   public Employee(String name, int salary) {
    this.name = name;
    this.salary = salary;
   }

   public String getName() {
    return this.name;
   }
   public int getSalary() {
    return this.salary;
   }
}

