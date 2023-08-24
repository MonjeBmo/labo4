package pelicula;

public class movie3D extends movie implements mov {

    private String _3DFormat;

    public movie3D(String nameMov, long minutes, int releaseYear, String genre, double ticketPrice, String _3DFormat) {
        super(nameMov, minutes, releaseYear, genre, ticketPrice);
        this._3DFormat = _3DFormat;
    }

    @Override
    public void getName() {
        System.out.println("El nombre de la Pelicula 3D es : " + super.getNameMov());
        System.out.println("Year : " + super.getReleaseYear());
        System.out.println("Genero : " + super.getGenre());
        System.out.println("Valor Ticket : " + super.getTicketPrice());
        System.out.println("Formato 3D : " + this._3DFormat);
    }

    @Override
    public long timeMov() {
        System.out.println("Minutos de la Pelicula 3D: ");
        return super.getMinutes();
    }

    public String get_3DFormat() {
        return _3DFormat;
    }

    public void set_3DFormat(String _3DFormat) {
        this._3DFormat = _3DFormat;
    }
}
