import java.util.Scanner;
public class TaxCalculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the type of the vehicle(Bike/ Car/ Truck): ");
        String type = scanner.nextLine();

        System.out.print("Enter the price of the vehicle: Rs. ");
        double price = scanner.nextDouble();

        Vehicle vehicle;

        switch(type.toLowerCase()){
            case "bike":
                vehicle = new Bike(price);
                break;
            case "car":
                vehicle = new Car(price);
                break;
            case "truck":
                vehicle = new Truck(price);
                break;
            default:
                System.out.println("Invalid input! Please enter a valid input");
                return;
        }

        double tax = vehicle.calculatedTAX();
        double totalPrice = vehicle.finalPrice();

        System.out.println("The calculated TAX Rs. "+tax);
        System.out.println("The Total price after adding TAX: Rs. "+totalPrice);
    }
}