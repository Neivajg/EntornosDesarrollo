package main.java.divisible3;

public class Divisible3 {

    public static String esDivisible(int n) {

        int suma = 0;

        for (int i = 1; i <= n; i++) {
            suma += sumaDigitos(i);
        }
        return suma % 3 == 0 ? "SI" : "NO";
    }
    private static int sumaDigitos(int numero) {
        int suma = 0;

        while (numero > 0) {
            suma += numero % 10;
            numero /= 10;
        }

        return suma;
    }
}