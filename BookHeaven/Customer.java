// Abstract class for Customer
abstract class Customer {
    protected double purchaseAmount;

    public Customer(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public abstract double calculateDiscount();

    public double getFinalAmount() {
        return purchaseAmount - calculateDiscount();
    }
}