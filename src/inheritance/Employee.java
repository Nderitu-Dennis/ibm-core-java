package inheritance;

public class Employee {
    private String employeeName;
    private double employeeSalary;
    private int employeeId;

    public Employee(String employeeName,double employeeSalary, int employeeId){
        this.employeeName=employeeName;
        this.employeeSalary=employeeSalary;
        this.employeeId=employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public void employeeWork(){
        System.out.println(getEmployeeName() + " is performing some work");
    }

    public void displayInfo(){
        System.out.println("name: " + getEmployeeName() + " salary: " +getEmployeeSalary() + " id: " + getEmployeeId());

    }

}
