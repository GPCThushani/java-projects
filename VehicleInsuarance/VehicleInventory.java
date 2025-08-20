public class VehicleInventory{
    private Vehicle[] vehicles;
    private int count;

    public VehicleInventory( int size){
        vehicles = new Vehicle[size];
        count = 0;
    }
    public void addVehicle (Vehicle vehicle){
        if(count < vehicles.length){
            vehicles[count] = vehicle;
            count ++;
        }
        else{
            System.out.println("Insufficient size");
        }
    }
    public double getTotalPremium(){
        double total = 0 ;
        for(int i= 0; i<count; i++){
            total = total + vehicles[i].calculateInsurancePremium();
        }
        return total;
    }
}
