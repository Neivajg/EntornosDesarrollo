package zapping;

public class Zapping {

    private static final int TOTAL_CANALES = 99;

    public static int calcularClicks(int origen, int destino) {

        if (origen == destino) return 0;

        int directa = Math.abs(origen - destino);
        int circular = TOTAL_CANALES - directa;

        return Math.min(directa, circular);
    }
}