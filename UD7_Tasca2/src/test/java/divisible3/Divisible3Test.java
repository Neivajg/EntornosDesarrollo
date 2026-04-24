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
}