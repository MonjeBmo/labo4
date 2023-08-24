package pelicula;

import java.util.concurrent.TimeUnit;

public class movie {
    private String nameMov;
    private long minutes;
    private int releaseYear;
    private String genre;
    private double ticketPrice;

    public movie(String nameMov, long minutes, int releaseYear, String genre, double ticketPrice) {
        this.nameMov = nameMov;
        this.minutes = minutes;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.ticketPrice = ticketPrice;
    }

    public String getNameMov() {
        return nameMov;
    }

    public void setNameMov(String nameMov) {
        this.nameMov = nameMov;
    }

    public long getMinutes() {
        return minutes;
    }

    public void setMinutes(long minutes) {
        this.minutes = minutes;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
