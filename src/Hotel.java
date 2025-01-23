public class Hotel {
    String name;
    String description;
    boolean parking;
    int vote;
    double distanceToCenter;

    public Hotel(String name, String description, boolean parking, int vote, double distanceToCenter) {
        this.name = name;
        this.description = description;
        this.parking = parking;
        this.vote = vote;
        this.distanceToCenter = distanceToCenter;
    }

    public String toString() {
        return "Hotel { " +
                "\n name= '" + this.name + '\'' +
                ",\n description= '" + this.description + '\'' +
                ",\n parking= " + this.parking +
                ",\n vote= " + this.vote +
                ",\n distanceToCenter= " + this.distanceToCenter +
                "\n }";
    }
}

/*
1. Creazione della public class Hotel
2. Creazione degli attributi e tipizzazione degli attributi (String -> reference | int, boolean, double -> primitive)
3. Creazione del costruttore della classe che ci servirà in seguito per istanziare la classe, al quale passeremo dei parametri che avremo stabilito
qui cioè name, description ecc..., dopodiche assegneremo questi valori agli attributi della classe richiamandoli con il this
4. Override del metodo toString che in partenza ci restituisce solo l'indirizzo di memoria della classe, noi lo sovrascriviamo
facendoci restituire le informazioni che ci servono. E' utile poiche in java non abbiamo uno strumento simile come
siamo invece abituati in altri linguaggi come Javascript
 */

