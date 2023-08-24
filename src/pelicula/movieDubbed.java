package pelicula;

public class movieDubbed extends movie implements mov {

    private boolean subtitles;

    public movieDubbed(String nameMov, long minutes, int releaseYear, String genre, double ticketPrice, boolean subtitles) {
        super(nameMov, minutes, releaseYear, genre, ticketPrice);
        this.subtitles = subtitles;
    }

    @Override
    public void getName() {
        System.out.println("El nombre de la Pelicula doblada es : " + super.getNameMov());
        System.out.println("Year : " + super.getReleaseYear());
        System.out.println("Genero : " + super.getGenre());
        System.out.println("Valor Ticket : " + super.getTicketPrice());
        System.out.println("Sub : " + (!this.subtitles ? "No" : "Si"));

    }

    @Override
    public long timeMov() {
        System.out.println("Minutos de la Pelicula : ");
        return super.getMinutes();
    }

    public boolean isSubtitles() {
        return subtitles;
    }

    public void setSubtitles(boolean subtitles) {
        this.subtitles = subtitles;
    }
}
