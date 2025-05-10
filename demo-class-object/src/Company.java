import com.azul.crs.client.rework.jars.classmethods.ClassMethodsDetector;

public class Company {
  private String name;
  private Dept[] depts;

  public Company(String name) {
    this.name = name;
  }

  public void add(Dept newDept) {
    Dept[] newdDepts = new Dept[this.depts.length + 1];
    for (int i = 0; i < this.depts.length; i++) {
      newdDepts[i] = depts[i];
    }
    newdDepts[newdDepts.length - 1] = newDept;
    this.depts = newdDepts;
  }
  
  public static void main(String[] args) {
    Company[] Companys = new Company[0];

    Company ABC = new Company("ABC");
    
    Dept dept1 = new Dept("Ops");

    Staff dept1StaffA = new Staff("Ada", 99, 40);
    dept1.add(dept1StaffA);

    Staff dept1StaffB = new Staff("Billy", 200, 50);
    dept1.add(dept1StaffB);

    Staff dept1StaffC = new Staff("Carol", 150, 50);
    dept1.add(dept1StaffC);

    ABC.add(dept1);
    System.out.println(ABC.name, ABC.dept1.name);
    System.out.println(dept1.substotalOfDept());
  }
}
