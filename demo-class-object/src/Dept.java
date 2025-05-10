import java.math.BigDecimal;

public class Dept {
  private String name;
  private Staff[] staffs;
  private double substotalOfDept;

  public String getName() { 
    return this.name;
  }

  public Dept(String name) {
    this.name = name;
    this.staffs = new Staff[0];
  }
  public void add(Staff newStaff) {
    Staff[] newStaffs = new Staff[this.staffs.length + 1];
    for (int i = 0; i < this.staffs.length; i++) {
      newStaffs[i] = staffs[i];
    }
    newStaffs[newStaffs.length - 1] = newStaff;
    this.staffs = newStaffs;
  }
  public double substotalOfDept() {
    for (int i = 0; i < this.staffs.length; i++) {
      substotalOfDept += this.staffs[i].payroll();
    }
    return substotalOfDept;
  }
    public double getSubtotalOfDept() {
      return  this.substotalOfDept;
    }

  public static void main(String[] args) {
    Dept[] depts = new Dept[1];
    depts[0] = new Dept("Ops");

    Dept Ops = new Dept("Ops team");

    Staff staff1 = new Staff("Ada", 80.0, 50);
    Ops.add(staff1);

    Staff staff2 = new Staff("Billy", 120.0, 30);
    Ops.add(staff2);

    System.out.println(depts[0].name);
    System.out.println(depts[0].getName());
    System.out.println(Ops.substotalOfDept());

  }
}

