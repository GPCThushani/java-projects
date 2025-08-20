public class Main{
    public static void main(String[]args){
        VehicleInventory inventory = new VehicleInventory(5);

        inventory.addVehicle (new Car(250000, 2025));
        inventory.addVehicle (new Car(56000, 2020));

        double totalPrice = inventory.getTotalPremium();
        System.out.println("Total is "+totalPrice);
    }
}
