import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Hotel> hotels = new ArrayList<>();

        hotels.add(new Hotel("Hotel Belvedere", "Hotel Belvedere Descrizione", true, 4, 10.4));
        hotels.add(new Hotel("Hotel Futuro", "Hotel Futuro Descrizione", true, 2, 2.0));
        hotels.add(new Hotel("Hotel Rivamare", "Hotel Rivamare Descrizione", false, 1, 1.0));
        hotels.add(new Hotel("Hotel Bellavista", "Hotel Bellavista Descrizione", false, 5, 5.5));
        hotels.add(new Hotel("Hotel Milano", "Hotel Milano Descrizione", true, 2, 50.0));

        for (Hotel hotel : hotels) {
            System.out.println(hotel);
        }
    }
}