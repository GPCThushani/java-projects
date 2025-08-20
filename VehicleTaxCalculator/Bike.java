class Bike extends Vehicle{
    public Bike (double price){
        super(price);
    }
    public double calculatedTAX(){
        return price * 0.05;
    }
}
