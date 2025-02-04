package inheritance;

public class Manager extends Employee{
    private String department;


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Manager(String employeeName, double employeeSalary, int employeeId, String department){
       super(employeeName, employeeSalary, employeeId);
       this.department=department;
   }
}
