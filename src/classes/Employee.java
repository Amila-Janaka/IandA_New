
package classes;

public class Employee {
   private int empID ;
   private String empName;
   private String empMobile;
   private String empEmail;
   private String empAddress;
   private String empPassword;
   private String empGender;

    public Employee(int empID, String empName, String empMobile, String empEmail, String empAddress, String empPassword, String empGender) {
        this.empID = empID;
        this.empName = empName;
        this.empMobile = empMobile;
        this.empEmail = empEmail;
        this.empAddress = empAddress;
        this.empPassword = empPassword;
        this.empGender = empGender;
    }

    public String getEmpGender() {
        return empGender;
    }

    public void setEmpGender(String empGender) {
        this.empGender = empGender;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpMobile() {
        return empMobile;
    }

    public void setEmpMobile(String empMobile) {
        this.empMobile = empMobile;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getEmpPassword() {
        return empPassword;
    }

    public void setEmpPassword(String empPassword) {
        this.empPassword = empPassword;
    }
   
}
