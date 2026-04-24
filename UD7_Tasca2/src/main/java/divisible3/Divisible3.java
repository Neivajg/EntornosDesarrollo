package main.java.divisible3;

public class Divisible3 {

    public static String esDivisible(int n) {

        int suma = 0;

        for (int i = 1; i <= n; i++) {
            String num = String.valueOf(i);

            for (char c : num.toCharArray()) {
                suma += c - '0';
            }
        }

        return (suma % 3 == 0) ? "SI" : "NO";
    }
}