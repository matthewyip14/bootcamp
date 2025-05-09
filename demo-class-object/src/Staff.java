import java.math.BigDecimal;

public class Staff {
  private double workingHour;
  private double hourlyRate;
  private int attendanceBonus;

  public double getWorkingHour() {
    return this.workingHour;
  }
  public void setWorkingHour(double workingHour) {
    this.workingHour = workingHour;
  }

  public double getHourlyRate() {
    return this.hourlyRate;
  }
  public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
  }

  public double getAttendanceBonus() {
    return this.attendanceBonus;
  }
  public void setAttendanceBonus(int attendanceBonus) {
    this.attendanceBonus = attendanceBonus;
  }
  private Staff(double workingHour, double hourlyRate) {
    this.workingHour = workingHour;
    this.hourlyRate = hourlyRate;
  }

  private double payroll() {
    if (this.workingHour > 100) {
      attendanceBonus = 1000;
    } else {
      attendanceBonus = 0;
    }
    return this.workingHour * this.hourlyRate + attendanceBonus;
  } 
  
  public static void main(String[] args) {
    Staff staff1 = new Staff(101.0, 50);
    System.out.println(staff1.payroll());
  }
  
}
