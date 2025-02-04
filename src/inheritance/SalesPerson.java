package inheritance;

public class SalesPerson extends Employee{
    private double commission;

    public SalesPerson(String employeeName, double employeeSalary, int employeeId, double commission){
        super(employeeName, employeeSalary, employeeId);
        this.commission=commission;

    }


}
