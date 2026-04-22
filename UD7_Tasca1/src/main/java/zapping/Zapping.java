package zapping;

public class Zapping {

    public static int calcularClicks(int origen, int destino) {

        int diferencia = Math.abs(origen - destino);
        int vuelta = 99 - diferencia;

        return Math.min(diferencia, vuelta);
    }
}