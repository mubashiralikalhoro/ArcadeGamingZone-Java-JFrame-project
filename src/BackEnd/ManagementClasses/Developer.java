
package BackEnd.ManagementClasses;

public class Developer extends Employee {

    
    private String assignedWork;
    private String devName;

    public Developer(String assignedWork, String devName, int salary, int empID, String contact, double workingHours, String name, String email) {
        super(salary, empID, contact, workingHours, name, email);
        this.assignedWork = assignedWork;
        this.devName = devName;
    }

    
    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }
    public Developer(){}
  

    public String getAssignedWork() {
        return assignedWork;
    }

    public void setAssignedWork(String assignedWork) {
        this.assignedWork = assignedWork;
    }
    
    
    
}
