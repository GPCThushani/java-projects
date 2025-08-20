import java.util.Scanner;
public class BookHaven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer type (Student / Regular / Premium): ");
        String type = scanner.nextLine();
        System.out.print("Enter purchase amount: Rs. ");
        double amount = scanner.nextDouble();
        Customer customer;
        switch (type.toLowerCase()) {
            case "student":
                customer = new Student(amount);
                break;
            case "regular":
                customer = new Regular(amount);
                break;
            case "premium":
                customer = new Premium(amount);
                break;
            default:
                System.out.println("Invalid customer type.");
                return;
        }
        double discount = customer.calculateDiscount();
        double finalAmount = customer.getFinalAmount();

        System.out.println("\nDiscount: Rs. " + discount);
        System.out.println("Final Amount to Pay: Rs. " + finalAmount);
    }
}
