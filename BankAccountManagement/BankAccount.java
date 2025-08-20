import java.util.Scanner;
class BankAccount{
    private String accountHolderName;
    private double balance;

    public BankAccount(String name, double initialBalance){
        accountHolderName = name;
        balance = initialBalance;
    }

    public void deposit (double amount){
        if(amount>0){
            balance = balance+ amount;
            System.out.println("Deposited: Rs. "+amount);
        }
        else{
            System.out.println("Invalid amount to deposit");
        }
    }

    public void withdraw (double amount){
        if (amount>balance){
            System.out.println("Insufficient Amount to withdraw");
        }
        else if(amount<=0){
            System.out.println("Invalid Amount!");
        }
        else{
            balance = balance - amount;
            System.out.println("Withdrawn: Rs. "+amount);
        }
    }

    public void displayBalance(){
        System.out.println("Current Balance: Rs. "+balance);
    }
}