class Student extends Customer {
    public Student(double purchaseAmount) {
        super(purchaseAmount);
    }

    public double calculateDiscount() {
        return (purchaseAmount < 1000) ? purchaseAmount * 0.10 : purchaseAmount * 0.15;
    }
}
