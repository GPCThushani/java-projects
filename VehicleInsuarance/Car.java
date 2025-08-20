class Car extends Vehicle{
    public Car(double price, int year){
        super(price, year);
    }
    public double calculateInsurancePremium(){
        return price *0.05;
    }
}
