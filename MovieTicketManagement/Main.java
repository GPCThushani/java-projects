import java.util.*;

public class Main {
    static List<Movie> movies = new ArrayList<>();
    static List<Ticket> tickets = new ArrayList<>();
    static double totalRevenue = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        movies.add(new Movie("Inception", "2h 28m", "English", 10));
        movies.add(new Movie("Dangal", "2h 49m", "Hindi", 10));

        while (true) {
            System.out.println("\n--- Movie Ticket Booking System ---");
            System.out.println("1. Display Movies");
            System.out.println("2. Book a Ticket");
            System.out.println("3. Cancel a Ticket");
            System.out.println("4. Generate Report");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> displayMovies();
                case 2 -> bookTicket(scanner);
                case 3 -> cancelTicket(scanner);
                case 4 -> generateReport();
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private static void displayMovies() {
        System.out.println("\nAvailable Movies:");
        for (int i = 0; i < movies.size(); i++) {
            System.out.print((i + 1) + ". ");
            movies.get(i).displayMovie();
        }
    }

    private static void bookTicket(Scanner scanner) {
        displayMovies();
        System.out.print("Select a movie (1 or 2): ");
        int movieChoice = scanner.nextInt();
        if (movieChoice < 1 || movieChoice > movies.size()) {
            System.out.println("Invalid movie selection.");
            return;
        }

        Movie selectedMovie = movies.get(movieChoice - 1);

        if (selectedMovie.getAvailableSeats() == 0) {
            System.out.println("No seats available for this movie.");
            return;
        }

        System.out.print("Enter seat number: ");
        int seatNumber = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter seat type (Regular/Premium): ");
        String seatType = scanner.nextLine();
        double price = seatType.equalsIgnoreCase("Premium") ? 300 : 200;

        Ticket ticket = new Ticket(selectedMovie.getMovieName(), seatNumber, seatType, price);
        tickets.add(ticket);
        selectedMovie.bookSeat();
        totalRevenue += price;

        System.out.println("\nTicket Booked:");
        ticket.displayTicket();
    }

    private static void cancelTicket(Scanner scanner) {
        System.out.print("Enter ticket ID to cancel: ");
        int ticketId = scanner.nextInt();

        Ticket ticketToCancel = null;
        for (Ticket t : tickets) {
            if (t.getTicketID() == ticketId) {
                ticketToCancel = t;
                break;
            }
        }

        if (ticketToCancel == null) {
            System.out.println("Ticket not found.");
            return;
        }

        for (Movie movie : movies) {
            if (movie.getMovieName().equalsIgnoreCase(ticketToCancel.getMovieName())) {
                movie.cancelSeat();
                break;
            }
        }

        double refund = ticketToCancel.getPrice();
        totalRevenue -= refund;
        tickets.remove(ticketToCancel);

        System.out.println("Ticket with ID " + ticketId + " cancelled. Refund: $" + refund);
    }

    private static void generateReport() {
        System.out.println("\nBooking Summary:");
        System.out.println("Tickets Sold: " + tickets.size());
        System.out.println("Total Revenue: $" + totalRevenue);
    }
}
