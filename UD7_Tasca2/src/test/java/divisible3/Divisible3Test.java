import main.java.divisible3.Divisible3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Divisible3Test {

    @Test
    void n2() {
        assertEquals("SI", Divisible3.esDivisible(2));
    }
}