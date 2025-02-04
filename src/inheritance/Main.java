package inheritance;

public class Main {
    public static void main(String[] args) {
        /*Manager manager = new Manager("dennis",
                5000, 1, "HR");
        manager.employeeWork();
        manager.displayInfo();*/

        SalesPerson sp = new SalesPerson("mazindere the sales man\n"
        ,4500, 123, 70000);
        sp.displayInfo();
        sp.employeeWork();

        Manager em = new Manager("kanethe", 677, 45,"hrr");



    }
}
