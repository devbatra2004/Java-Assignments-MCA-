
public class MovieTicket {

    String movieName;
    int seatNumber;
    double price;

    void bookTicket(String movie, int seat, double cost) {
        movieName = movie;
        seatNumber = seat;
        price = cost;
    }

    void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.bookTicket("Avengers: Endgame", 12, 250.0);

        ticket.displayTicket();
    }
}
