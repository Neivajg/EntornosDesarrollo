
// 1. Creamos la clase y declaramos el constructor-.
public class Area {
    private int id;
    private Punt punt1;
    private Punt punt2;
    private Punt punt3;

    // Constructor con 3 puntos individuales
    public Area(int id, Punt punt1, Punt punt2, Punt punt3) {
        this.id = id;
        this.punt1 = punt1;
        this.punt2 = punt2;
        this.punt3 = punt3;
    }

    // Constructor con array de puntos
    public Area(int id, Punt[] punts) {
        if (punts.length != 3) {
            throw new IllegalArgumentException("Area necesita exactamente 3 puntos");
        }
        this.id = id;
        this.punt1 = punts[0];
        this.punt2 = punts[1];
        this.punt3 = punts[2];
    }

    @Override
    public String toString() {
        return "Area{id=" + id + ", punts=[" + punt1 + ", " + punt2 + ", " + punt3 + "]}";
    }
}
