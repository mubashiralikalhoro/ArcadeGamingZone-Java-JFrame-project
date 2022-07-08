
package BackEnd;

public class Report {
    private String name,report;

    public Report(String name, String report) {
        this.name = name;
        this.report = report;
    }

    public Report() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }
    
}
