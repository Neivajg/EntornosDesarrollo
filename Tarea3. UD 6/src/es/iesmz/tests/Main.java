package es.iesmz.tests;

public class Main {
    public static void main(String[] args) {
        // Creamos un objeto de la clase Compte [cite: 10]
        es.iesmz.tests.Compte miCuenta = new es.iesmz.tests.Compte("1234567890", "Usuario de Prueba");

        // Probamos a generar un IBAN con datos de la tarea [cite: 35]
        String resultado = miCuenta.generaIBAN("0030", "2053", "09", "1234567895");

        System.out.println("El IBAN generado es: " + resultado);


        boolean esValido = miCuenta.compruebaIBAN(resultado);
        System.out.println("¿Es válido el IBAN? " + esValido);
    }
}