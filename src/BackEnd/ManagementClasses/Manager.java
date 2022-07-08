package BackEnd.ManagementClasses;

public class Manager extends Employee {

    private String assignedWork;
    private String manName;
    public Manager() {
    }

    public Manager(String assignedWork,String manName, int salary, int empID, String contact, double workingHours, String name, String email) {
        super(salary, empID, contact, workingHours, name, email);
        this.assignedWork = assignedWork;
        this.manName=manName;
    }

    public String getAssignedWork() {
        return assignedWork;
    }

    public void setAssignedWork(String assignedWork) {
        this.assignedWork = assignedWork;
    }

    public String getManName() {
        return manName;
    }

    public void setManName(String manName) {
        this.manName = manName;
    }
    
    
      
    
    

}
