class Car extends Vehicle{
    public Car (double price){
        super(price);
    }
    public double calculatedTAX(){
        return price * 0.1;
    }
}
