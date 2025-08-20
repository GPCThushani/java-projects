public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Regular Book
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        library.addBook(book1);

        // EBook
        EBook ebook1 = new EBook("Digital Fortress", "Dan Brown", "9788489367012", 1.5);
        library.addBook(ebook1);

        // Display all
        library.displayAllBooks();
    }
}
