
        public class App{
            public static void main(String[] args) {
                // Erstellen von Mitarbeiter-Objekten
                Mitarbeiter mitarbeiter1 = new Mitarbeiter("Meier", "Hans", "Entwickler", 2015);
                Mitarbeiter mitarbeiter2 = new Mitarbeiter("Schmidt", "Anna", "Designer", 2018);
                Mitarbeiter mitarbeiter3 = new Mitarbeiter("Martinelli", "Silvia", "CEO", 2020);
        
                // Ausgabe der Informationen der Mitarbeiter
                System.out.println("Mitarbeiter 1:");
                mitarbeiter1.printInfo();
        
                System.out.println("\nMitarbeiter 2:");
                mitarbeiter2.printInfo();
        
                System.out.println("\nMitarbeiter 3:");
                mitarbeiter3.printInfo();
            }
}

