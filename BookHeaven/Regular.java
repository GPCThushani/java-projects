
class Regular extends Customer {
    public Regular(double purchaseAmount) {
        super(purchaseAmount);
    }
    public double calculateDiscount() {
        return (purchaseAmount < 1000) ? purchaseAmount * 0.05 : purchaseAmount * 0.10;
    }
}
