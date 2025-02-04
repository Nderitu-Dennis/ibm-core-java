package encapsulation;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Kidagaa", "ken walibora", 5000);
        System.out.println(bank.getBalance());
        bank.setTBalance(6000);
        System.out.println(bank.getBalance());
    }
}
