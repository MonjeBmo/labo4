
import pelicula.movieScreening;
import pelicula.movie;
import pelicula.movie3D;
import pelicula.mov;
import pelicula.movieDubbed;


import java.util.ArrayList;
import java.util.Scanner;

class data {
    String nameMov, genre;
    long minutes;
    int releaseYear;
    double ticketPrice;

    public void infoGeneral(Scanner scanner) {
        System.out.println("Ingrese el Nombre de la Pelicula : ");
        nameMov = scanner.next();
        System.out.println("Ingrese los minutos : ");
        minutes = scanner.nextLong();
        System.out.println("Ingrese el year : ");
        releaseYear = scanner.nextInt();
        System.out.println("Ingrese el genero : ");
        genre = scanner.next();
        System.out.println("Ingrese el valor del ticket : ");
        ticketPrice = scanner.nextDouble();
    }

}


public class Main {
    static ArrayList<movieDubbed> pelisDubbed = new ArrayList<movieDubbed>();
    static ArrayList<movie3D> pelis3D = new ArrayList<movie3D>();
    static ArrayList<movieScreening> funciones = new ArrayList<movieScreening>();

    public static void main(String[] args) {
        System.out.println("Cineflix");
        Scanner scanner = new Scanner(System.in);
        // create dubbed movie
        String otro = "";
        int op;
        do {
            System.out.println("Ingresar Peliculas");
            System.out.println("1 - 3D");
            System.out.println("2 - Dobladas\nIngrese su Opcion : ");
            op = scanner.nextInt();
            switch (op) {
                case 1 -> _3DMethod(scanner);
                case 2 -> DubbedMethod(scanner);
                default -> System.out.println("Opcion invalida");
            }
            System.out.println("Ingresar otro Pelicula S-si N-cualquier tecla ...");
            otro = scanner.next();
        } while ((otro.equals("S") || otro.equals("s")));

        do {

            System.out.println("Listado de Peliculas 3D para agregar Funciones : ");
//            agregar 3D
            int l = 1;
            for (movie3D movie : pelis3D) {
                System.out.println(l + " -> " + movie.getNameMov());
                System.out.println("Agregar Funciones de la Pelicula NO." + l);
                ArrayList<String> dataTimeTable = infoTimeTable(scanner);
                System.out.println("->Ingrese la cantidad de Boletos : ");
                int cantTicket = scanner.nextInt();
                funciones.add(new movieScreening(pelis3D.get(l - 1), dataTimeTable, cantTicket));
                l++;
            }
            System.out.println("Listado de Peliculas Dobladas Para agregar Funciones : ");

            int i = 1;
            for (movieDubbed movie : pelisDubbed) {
                System.out.println(i + " -> " + movie.getNameMov());
                System.out.println("Agregar Funciones de la Pelicula NO." + i);
                ArrayList<String> dataTimeTable = infoTimeTable(scanner);
                System.out.println("->Ingrese la cantidad de Boletos : ");
                int cantTicket = scanner.nextInt();
                funciones.add(new movieScreening(pelisDubbed.get(i - 1), dataTimeTable, cantTicket));
                i++;
            }


            System.out.println("Reingresar todas las funciones S-si N-cualquier tecla ...");
            otro = scanner.next();
        } while ((otro.equals("S") || otro.equals("s")));

        do {
            int h = 1;
            for (movie3D movie : pelis3D) {
                System.out.println("======== Peli 3D No." + h + " ==========");
                ((mov) movie).getName();
                h++;

            }
            for (movieDubbed movie : pelisDubbed) {
                System.out.println("======== Peli Doblada No." + h + " ==========");
                ((mov) movie).getName();
                h++;
            }
            //            agregar 3D


            System.out.println("Ver horarios ingrese el No. de peli");
            int o = scanner.nextInt();
            System.out.println("Horarios Peli - " + funciones.get(o - 1).getMovie().getNameMov());
            int y = 1;
            for (String time : funciones.get(o - 1).getTimetable()) {
                System.out.println(y + " - Funcion -> " + time);
                y++;
            }
            System.out.println("->Ingrese el numero de funcion : ");
            int funOp = scanner.nextInt();
            System.out.println("Desea comprar un boleto para esa funcion?\n S - si CualquierTecla - no");
            String yes = scanner.next();
            if ((yes.equals("S") || yes.equals("s"))) {
                try {
                    System.out.println("Cantidad de Ticket? ");
                    int cantT = scanner.nextInt();
                    try {
                        funciones.get(o - 1).saleTicket(cantT);
                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                    System.out.println("Ticket's Vendidos :" + cantT + " a Q." + funciones.get(o - 1).getMovie().getTicketPrice());
                    System.out.println("Total : " + (cantT * funciones.get(o - 1).getMovie().getTicketPrice()));
                    System.out.println(((mov) funciones.get(o - 1).getMovie()).timeMov());
                } catch (Exception e) {
                    System.out.println("Error al Realizar la Venta!!!!");
                    return;
                }
            } else {
                System.out.println("Feliz dia Tickets Vendidos 0!");
            }
            System.out.println("Ver el listado y comprar S-si N-cualquier tecla ...");
            otro = scanner.next();
        } while ((otro.equals("S") || otro.equals("s")));

    }

    public static ArrayList<String> infoTimeTable(Scanner scanner) {
        ArrayList<String> timeTable = new ArrayList<>();
        String otro = "", day, month, year, hour, min, sala;

        do {
            System.out.println("Ingrese el Horario");
            System.out.println(" Dia : ");
            day = scanner.next();
            System.out.println(" Mes : ");
            month = scanner.next();
            System.out.println(" Year: ");
            year = scanner.next();
            System.out.println(" Hora: ");
            hour = scanner.next();
            System.out.println(" Minutos: ");
            min = scanner.next();
            System.out.println(" Sala: ");
            sala = scanner.next();

            timeTable.add((sala + " - " + day + "/" + month + "/" + year + " " + hour + ":" + min));
            System.out.println("Ingresar otro S-si N-cualquier tecla ...");
            otro = scanner.next();
        } while ((otro.equals("S") || otro.equals("s")));

        return timeTable;
    }

    public static void DubbedMethod(Scanner scanner) {
        data d = new data();
        boolean sub = false;
        String otro = "";

        do {
            d.infoGeneral(scanner);
            System.out.println("Ingrese \n1-Sub \n2-NoSub: ");
            int x = scanner.nextInt();
            if (x == 1) {
                sub = true;
            }
            pelisDubbed.add(new movieDubbed(d.nameMov, d.minutes, d.releaseYear, d.genre, d.ticketPrice, sub));

            System.out.println("Ingresar otro S-si N-cualquier tecla ...");
            otro = scanner.next();
        } while ((otro.equals("S") || otro.equals("s")));

        System.out.println("Save all success!");

    }

    //            agregar 3D
    public static void _3DMethod(Scanner scanner) {

        data d = new data();
        String format = "", otro;
        do {
            d.infoGeneral(scanner);
            System.out.println("Formato \n1-Dolby \n2-IMAX \n3-RealD \nIngrese Op: ");
            int x = scanner.nextInt();
            switch (x) {
                case 1 -> format = "Dolby";
                case 2 -> format = "IMAX";
                case 3 -> format = "RealD";
                default -> System.out.println("Opcion no valida!");
            }
            pelis3D.add(new movie3D(d.nameMov, d.minutes, d.releaseYear, d.genre, d.ticketPrice, format));
            System.out.println("Ingresar otro S-si N-cualquier tecla ...");
            otro = scanner.next();
        } while ((otro.equals("S") || otro.equals("s")));
    }
}