
public class Mitarbeiter {
    private String name;
    private String vorname;
    private String funktion;
    private int eintrittsjahr;

    // Konstruktor
    public Mitarbeiter(String name, String vorname, String funktion, int eintrittsjahr) {
        this.name = name;
        this.vorname = vorname;
        this.funktion = funktion;
        this.eintrittsjahr = eintrittsjahr;
    }

    // Methode, um Informationen abzurufen
    public String getInfo(String parameter) {
        switch (parameter.toLowerCase()) {
            case "name":
                return name;
            case "vorname":
                return vorname;
            case "funktion":
                return funktion;
            case "eintrittsjahr":
                return String.valueOf(eintrittsjahr);
            default:
                return "Unbekannter Parameter";
        }
    }
}
