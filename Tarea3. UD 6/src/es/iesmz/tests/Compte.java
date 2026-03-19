package es.iesmz.tests;

import java.math.BigInteger;

public class Compte {
    private String numeroCompte;
    private String titular;

    public Compte(String numeroCompte, String titular) {
        this.numeroCompte = numeroCompte;
        this.titular = titular;
    }

    // Genera un IBAN a partir de los componentes del CCC
    public String generaIBAN(String entitat, String oficina, String dc, String compte) {
        // Validación de longitud y que sean solo números
        if (entitat.length() != 4 || oficina.length() != 4 || dc.length() != 2 || compte.length() != 10) {
            return null;
        }

        String ccc = entitat + oficina + dc + compte;
        if (!ccc.matches("\\d+")) return null;

        // Paso 1 y 2: Preparar número para el cálculo (CCC + 142800) [cite: 20, 21]
        // Se añade 142800 porque E=14 y S=28 seguido de 00 [cite: 21]
        String numeroParaCalculo = ccc + "142800";

        // Paso 3: Dividir por 97 y la resta se le resta a 98 [cite: 22]
        BigInteger bigInt = new BigInteger(numeroParaCalculo);
        int resta = bigInt.mod(new BigInteger("97")).intValue();
        int dcIban = 98 - resta;

        // El resultado debe ser de dos cifras [cite: 22, 23]
        String dcIbanStr = String.format("%02d", dcIban);

        return "ES" + dcIbanStr + ccc;
    }

    // Comprueba si un IBAN es correcto
    public boolean compruebaIBAN(String iban) {
        // El IBAN debe tener 24 caracteres y empezar por ES [cite: 14, 15, 20]
        if (iban == null || iban.length() != 24 || !iban.startsWith("ES")) {
            return false;
        }

        String dcProporcionado = iban.substring(2, 4);
        String entitat = iban.substring(4, 8);
        String oficina = iban.substring(8, 12);
        String dc = iban.substring(12, 14);
        String cuenta = iban.substring(14, 24);

        // Generamos el IBAN correcto con esos datos y comparamos
        String ibanCorrecto = generaIBAN(entitat, oficina, dc, cuenta);

        return iban.equals(ibanCorrecto);
    }
}