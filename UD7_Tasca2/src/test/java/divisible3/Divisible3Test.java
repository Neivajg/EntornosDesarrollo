package test.java.divisible3;
import main.java.divisible3.Divisible3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Divisible3Test {

    @Test
    void n2() {
        Divisible3 Divisible3 = null;
        assertEquals("SI", Divisible3.esDivisible(2));
    }

    @Test
    void n6() {
        assertEquals("SI", Divisible3.esDivisible(6));
    }

    @Test
    void n1() {
        assertEquals("NO", Divisible3.esDivisible(1));
    }
    @Test
    void n3() {
        assertEquals("SI", Divisible3.esDivisible(3));
    }
    @Test
    void n10() {
        assertEquals("NO", Divisible3.esDivisible(10));
    }
    @Test
    void n12() {
        assertEquals("SI", Divisible3.esDivisible(12));
    }
}