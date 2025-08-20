abstract class Vehicle{
    protected double price;
    protected int year;

    public Vehicle(double price, int year){
        this.price = price;
        this.year = year;
    }
    public abstract double calculateInsurancePremium();
}