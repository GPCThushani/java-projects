public class EBook extends Book {
    private double fileSize;

    public EBook(String title, String author, String ISBN, double fileSize){
        super(title, author, ISBN);
        this.fileSize = fileSize;
    }

    public double getFileSize() { return fileSize; }
    public void setFileSize(double fileSize) { this.fileSize = fileSize; }

    // Overriding displayDetails
    @Override
    public void displayDetails() {
        super.displayDetails(); // show Book details
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("---------------");
    }
}
