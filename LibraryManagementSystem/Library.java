import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayAllBooks() {
        System.out.println("Library Collection:");
        for (Book book : books) {
            book.displayDetails(); // Polymorphic call
        }
    }
}
