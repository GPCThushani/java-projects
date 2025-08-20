class Truck extends Vehicle{
    public Truck (double price, int year){
        super(price, year);
    }
    public double calculateInsurancePremium(){
        return price * 0.08;
    }
}
