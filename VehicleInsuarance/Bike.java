class Bike extends Vehicle{
    public Bike (double price,int year){
        super(price,year);
    }
    public double calculateInsurancePremium(){
        return price* 0.02;
    }
}
