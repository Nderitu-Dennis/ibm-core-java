package encapsulation;

/*
* private variables can only be accessed and modified through getters and setters.
* This follows the principle of encapsulation, which helps protect data by restricting direct access.*/

public class Bank {
    private String title;
    private String accountHolderName;
    private double balance;

    public Bank(String title, String accountHolderName, double balance){
        this.title=title;
        this.accountHolderName = accountHolderName;
        this.balance=balance;
    }

    public double getBalance(){
        return balance;
    }

    public void setTBalance(double newBalance){
        balance=newBalance;
    }

    public void deposit(double depositAmount){
        System.out.println("initial balance: " + getBalance());
      //  depositAmount <=0? "error! " : balance+=depositAmount;
    }



}
