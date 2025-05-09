import java.math.BigDecimal;

public class Staff {
  private double workingHour;
  private double hourlyRate;
  private double attendanceBonus;

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
  public void setAttendanceBonus(double attendanceBonus) {
    this.attendanceBonus = attendanceBonus;
  }
  public Staff(double workingHour, double hourlyRate) {
    this.workingHour = workingHour;
    this.hourlyRate = hourlyRate;
  }

  public double payroll() {
    if (this.workingHour > 100) {
      this.attendanceBonus = 1000;
    } else {
      this.attendanceBonus = 0;
    }
    return BigDecimal.valueOf(this.workingHour).multiply(BigDecimal.valueOf(this.hourlyRate)).doubleValue() + attendanceBonus;
  } 
  
  public static void main(String[] args) {
    Staff staff1 = new Staff(101.0, 50);
    System.out.println(staff1.payroll());
  }
  
}
