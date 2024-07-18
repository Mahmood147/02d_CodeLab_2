
public class App {
    public static void main(String[] args) {
        // Erstellen von Mitarbeiter-Objekten
        Mitarbeiter mitarbeiter1 = new Mitarbeiter("Meier", "Hans", "Entwickler", 2015);
        Mitarbeiter mitarbeiter2 = new Mitarbeiter("Schmidt", "Anna", "Designer", 2018);
        Mitarbeiter mitarbeiter3 = new Mitarbeiter("Martinelli", "Silvia", "CEO", 2020);

        // Ausgabe der Informationen der Mitarbeiter
        System.out.println("Mitarbeiter 1:");
        System.out.println("Name: " + mitarbeiter1.getInfo("name"));
        System.out.println("Vorname: " + mitarbeiter1.getInfo("vorname"));
        System.out.println("Funktion: " + mitarbeiter1.getInfo("funktion"));
        System.out.println("Eintrittsjahr: " + mitarbeiter1.getInfo("eintrittsjahr"));

        System.out.println("\nMitarbeiter 2:");
        System.out.println("Name: " + mitarbeiter2.getInfo("name"));
        System.out.println("Vorname: " + mitarbeiter2.getInfo("vorname"));
        System.out.println("Funktion: " + mitarbeiter2.getInfo("funktion"));
        System.out.println("Eintrittsjahr: " + mitarbeiter2.getInfo("eintrittsjahr"));

        System.out.println("\nMitarbeiter 3:");
        System.out.println("Name: " + mitarbeiter3.getInfo("name"));
        System.out.println("Vorname: " + mitarbeiter3.getInfo("vorname"));
        System.out.println("Funktion: " + mitarbeiter3.getInfo("funktion"));
        System.out.println("Eintrittsjahr: " + mitarbeiter3.getInfo("eintrittsjahr"));
    }
}
