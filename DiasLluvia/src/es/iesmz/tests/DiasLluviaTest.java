package es.iesmz.tests;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DiasLluviaTest {
    // registroDia

    @Test
    public void testRegistroDiaOK1() {
        DiasLluvia d = new DiasLluvia();
        assertEquals(true, d.registroDia(5, 3, true));
    }

    @Test
    public void testRegistroDiaOK2() {
        DiasLluvia d = new DiasLluvia();
        assertEquals(true, d.registroDia(10, 12, false));
    }

    @Test
    public void testRegistroDiaFail() {
        DiasLluvia d = new DiasLluvia();
        assertNotEquals(true, d.registroDia(32, 1, true));
    }

    // consultarDia

    @Test
    public void testConsultarDiaOK1() {
        DiasLluvia d = new DiasLluvia();
        d.registroDia(1, 1, true);
        assertEquals(true, d.consultarDia(1, 1));
    }

    @Test
    public void testConsultarDiaOK2() {
        DiasLluvia d = new DiasLluvia();
        d.registroDia(2, 1, false);
        assertEquals(false, d.consultarDia(2, 1));
    }

    @Test
    public void testConsultarDiaFail() {
        DiasLluvia d = new DiasLluvia();
        assertNotEquals(true, d.consultarDia(40, 1));
    }

    // contarDiasLluviosos

    @Test
    public void testContarDiasOK1() {
        DiasLluvia d = new DiasLluvia();
        d.registroDia(1, 1, true);
        d.registroDia(2, 1, true);
        assertEquals(2, d.contarDiasLluviosos());
    }

    @Test
    public void testContarDiasOK2() {
        DiasLluvia d = new DiasLluvia();
        assertEquals(0, d.contarDiasLluviosos());
    }

    @Test
    public void testContarDiasFail() {
        DiasLluvia d = new DiasLluvia();
        d.registroDia(1, 1, true);
        assertNotEquals(0, d.contarDiasLluviosos());
    }

    // trimestreLluvioso

    @Test
    public void testTrimestreOK1() {
        DiasLluvia d = new DiasLluvia();
        d.registroDia(1, 1, true); // enero
        assertEquals(1, d.trimestreLluvioso());
    }

    @Test
    public void testTrimestreOK2() {
        DiasLluvia d = new DiasLluvia();
        d.registroDia(1, 7, true); // julio
        assertEquals(3, d.trimestreLluvioso());
    }

    @Test
    public void testTrimestreFail() {
        DiasLluvia d = new DiasLluvia();
        d.registroDia(1, 4, true);
        assertNotEquals(1, d.trimestreLluvioso());
    }

    // primerDiaLluvia

    @Test
    public void testPrimerDiaOK1() {
        DiasLluvia d = new DiasLluvia();
        d.registroDia(3, 1, true);
        assertEquals(3, d.primerDiaLluvia());
    }

    @Test
    public void testPrimerDiaOK2() {
        DiasLluvia d = new DiasLluvia();
        assertEquals(-1, d.primerDiaLluvia());
    }

    @Test
    public void testPrimerDiaFail() {
        DiasLluvia d = new DiasLluvia();
        d.registroDia(5, 1, true);
        assertNotEquals(3, d.primerDiaLluvia());
    }
}
