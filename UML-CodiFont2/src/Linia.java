
// 1. Crear la clase
public class Linia {
    private int id;
    private Punt punt1;  // X de PUNT
    private Punt punt2;  // y de PUNT

    // construir Constructor
    public Linia(int id, Punt punt1, Punt punt2) {
        this.id = id;
        this.punt1 = punt1;
        this.punt2 = punt2;
    }

    // Constructor con array de puntos
    public Linia(int id, Punt[] punts) {
        if (punts.length != 2) {
            throw new IllegalArgumentException("Línia necesita exactamente 2 puntos");
        }
        this.id = id;
        this.punt1 = punts[0];
        this.punt2 = punts[1];
    }

    @Override
    public String toString() {
        return "Linia{id=" + id + ", punts=[" + punt1 + ", " + punt2 + "]}";
    }

}
