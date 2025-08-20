class Truck extends Vehicle{
    public Truck(double price){
        super(price);
    }
    public double calculatedTAX(){
        return price*0.15;
    }
}
