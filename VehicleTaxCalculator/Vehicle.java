abstract class Vehicle{
    protected double price;
    public Vehicle (double price){
        this.price  = price;
    }
    public abstract double calculatedTAX();
    public double finalPrice(){
        return price + calculatedTAX();
    }
}
