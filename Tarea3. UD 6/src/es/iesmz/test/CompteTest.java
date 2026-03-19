package es.iesmz.test;

import es.iesmz.tests.Compte;
import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

public class CompteTest {

    @Test
    public void testCompruebaIBAN() {
        es.iesmz.tests.Compte compte = new es.iesmz.tests.Compte("1234567890", "Titular de Prova");

        // Casos que deben devolver true [cite: 34]
        assertTrue(compte.compruebaIBAN("ES6621000418401234567891"));
        assertTrue(compte.compruebaIBAN("ES6000491500051234567892"));
        assertTrue(compte.compruebaIBAN("ES9420805801101234567891"));

        // Casos que deben devolver false [cite: 34]
        assertFalse(compte.compruebaIBAN("ES7600246912501234567891"));
        assertFalse(compte.compruebaIBAN("ES4721000418401234567891"));
        assertFalse(compte.compruebaIBAN("ES8200491500051234567892"));
    }

    @Test
    public void testGeneraIBAN() {
        Compte compte = new Compte("1234567890", "Titular de Prova");

        // Casos con salida esperada de String [cite: 35]
        assertEquals("ES7100302053091234567895", compte.generaIBAN("0030", "2053", "09", "1234567895"));
        assertEquals("ES1000492352082414205416", compte.generaIBAN("0049", "2352", "08", "2414205416"));
        assertEquals("ES1720852066623456789011", compte.generaIBAN("2085", "2066", "62", "3456789011"));

        // Casos que deben devolver null por errores en parámetros [cite: 35]
        assertNull(compte.generaIBAN("2085", "2066", "62", "3456AE9011")); // Letras en cuenta
        assertNull(compte.generaIBAN("208", "2066", "62", "3456789011"));  // Entidad corta
        assertNull(compte.generaIBAN("2080", "20A6", "62", "3456789011")); // Letra en oficina
        assertNull(compte.generaIBAN("2080", "2086", "6", "3456789011"));  // DC corto
        assertNull(compte.generaIBAN("2080", "2086", "63", "345678911"));   // Cuenta corta
    }
}