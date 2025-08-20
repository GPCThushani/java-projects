public class Movie {
    private String movieName;
    private String duration;
    private String language;
    private int totalSeats;
    private int availableSeats;

    public Movie(String movieName, String duration, String language, int totalSeats) {
        this.movieName = movieName;
        this.duration = duration;
        this.language = language;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
    }

    public void displayMovie() {
        System.out.println("Movie: " + movieName + ", Duration: " + duration +
                ", Language: " + language + ", Available Seats: " + availableSeats);
    }

    public String getMovieName() {
        return movieName;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void bookSeat() {
        availableSeats--;
    }

    public void cancelSeat() {
        availableSeats++;
    }
}
