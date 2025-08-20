
// Premium Customer
class Premium extends Customer {
    public Premium(double purchaseAmount) {
        super(purchaseAmount);
    }
    public double calculateDiscount() {
        return (purchaseAmount < 1000) ? purchaseAmount * 0.15 : purchaseAmount * 0.20;
    }
}
