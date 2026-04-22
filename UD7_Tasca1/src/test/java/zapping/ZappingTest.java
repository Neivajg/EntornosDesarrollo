package test.java.zapping;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ZappingTest {

    @Test
    void mismoCanal() {
        assertEquals(0, zapping.Zapping.calcularClicks(0, 0));
    }

    @Test
    void canalesConsecutivos() {
        assertEquals(1, zapping.Zapping.calcularClicks(1, 2));
    }

    @Test
    void saltoDirecto() {
        assertEquals(20, zapping.Zapping.calcularClicks(10, 30));
    }

    @Test
    void saltoCircular() {
        assertEquals(2, zapping.Zapping.calcularClicks(2, 99));
    }

    @Test
    void casoEjemplo1() {
        assertEquals(41, zapping.Zapping.calcularClicks(5, 63));
    }

    @Test
    void casoEjemplo2() {
        assertEquals(41, zapping.Zapping.calcularClicks(63, 5));
    }

    @Test
    void casoEjemplo3() {
        assertEquals(49, zapping.Zapping.calcularClicks(1, 51));
    }
}