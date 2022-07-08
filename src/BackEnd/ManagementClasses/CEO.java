
package BackEnd.ManagementClasses;


public class CEO extends Employee {
    
private String ceoName;
private String assignedWork;

    public CEO(String ceoName, String assignedWork, int salary, int empID, String contact, double workingHours, String name, String email) {
        super(salary, empID, contact, workingHours, name, email);
        this.ceoName = ceoName;
        this.assignedWork = assignedWork;
    }


    public CEO(){}

    public String getCeoName() {
        return ceoName;
    }

    public void setCeoName(String ceoName) {
        this.ceoName = ceoName;
    }

    public String getAssignedWork() {
        return assignedWork;
    }

    public void setAssignedWork(String assignedWork) {
        this.assignedWork = assignedWork;
    }
    
    

    
}
