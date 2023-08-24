package pelicula;

import java.util.ArrayList;

public class movieScreening {
    private movie Movie;
    private ArrayList<String> timetable;
    private int cantTicket;

    public movieScreening(movie movie, ArrayList<String> timetable, int cantTicket) {
        Movie = movie;
        this.timetable = timetable;
        this.cantTicket = cantTicket;
    }

    public int saleTicket(int cant) throws Exception {
        if (cant == 0) {
            throw new Exception("Error al Realizar la Venta");
        } else if (this.cantTicket <= 0) {
            throw new Exception("Se acabaron las entradas");
        }
        return this.cantTicket -= cant;
    }


    public movie getMovie() {
        return Movie;
    }

    public void setMovie(movie movie) {
        Movie = movie;
    }

    public ArrayList<String> getTimetable() {
        return timetable;
    }

    public void setTimetable(ArrayList<String> timetable) {
        this.timetable = timetable;
    }

    public int getCantTicket() {
        return cantTicket;
    }

    public void setCantTicket(int cantTicket) {
        this.cantTicket = cantTicket;
    }
}
