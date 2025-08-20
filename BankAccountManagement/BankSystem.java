import java.util.Scanner;
public class BankSystem{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the Account Holder: ");
        String name = scanner.nextLine();

        System.out.print("Enter the initial balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(name, initialBalance);

        account.displayBalance();

        System.out.print("Enter the balance that you want to deposit: Rs. " );
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.println("Enter the amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        account.displayBalance();

    }
}