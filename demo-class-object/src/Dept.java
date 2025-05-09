import java.math.BigDecimal;

public class Dept {
  private long deptId;
  private String DeptName;
  private Staff[] staffs;
  
  public Dept() {
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
    double total = 0.0;
    for (int i = 0; i < this.staffs.length; i++) {
      total += this.staffs[i].payroll();
    }
    return total;
  }

  public static void main(String[] args) {
    Dept dept = new Dept();

    Staff staff1 = new Staff(80, 50);
    Dept.add(staff1);

    Staff billy = new staff(120, 30);
    Dept.add(billy);

    System.out.println(dept.substotalOfDept());

  }
}

