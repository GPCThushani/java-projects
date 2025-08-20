public class Ticket {
    private static int idCounter = 1;
    private int ticketID;
    private String movieName;
    private int seatNumber;
    private String seatType;
    private double price;

    public Ticket(String movieName, int seatNumber, String seatType, double price) {
        this.ticketID = idCounter++;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.seatType = seatType;
        this.price = price;
    }

    public void displayTicket() {
        System.out.println("Ticket ID: " + ticketID + ", Movie: " + movieName +
                ", Seat: " + seatNumber + ", Seat Type: " + seatType + ", Price: $" + price);
    }

    public int getTicketID() {
        return ticketID;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getSeatType() {
        return seatType;
    }

    public double getPrice() {
        return price;
    }
}
