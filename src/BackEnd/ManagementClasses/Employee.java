
package BackEnd.ManagementClasses;
public class Employee extends Person {
    private  int salary;
    private int empID;
    private String contact;
    private double workingHours;

    public Employee(){}
    public Employee(int salary, int empID, String contact, double workingHours, String name, String email) {
        super(name, email);
        this.salary = salary;
        this.empID = empID;
        this.contact = contact;
        this.workingHours = workingHours;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }
    
    
}
