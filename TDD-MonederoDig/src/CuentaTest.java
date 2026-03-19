import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CuentaTest {

    @Test
    void testAlCrearCuentaElSaldoEsCero() {
        Cuenta c = new Cuenta();
        assertEquals(0, c.getSaldo());
    }

    @Test
    void testIngresoNormal() {
        Cuenta c = new Cuenta();
        c.ingresar(100);
        assertEquals(100, c.getSaldo());
    }

    @Test
    void testIngresoNegativoNoCambiaSaldo() {
        Cuenta c = new Cuenta();
        c.ingresar(-100);
        assertEquals(0, c.getSaldo());
    }

    @Test
    void testIngresoMaximoSuperado() {
        Cuenta c = new Cuenta();
        c.ingresar(6000.01);
        assertEquals(0, c.getSaldo());
    }

    @Test
    void testRetiradaNormal() {
        Cuenta c = new Cuenta();
        c.ingresar(500);
        c.retirar(100);
        assertEquals(400, c.getSaldo());
    }

    @Test
    void testRetiradaMayorAlSaldo() {
        Cuenta c = new Cuenta();
        c.ingresar(200);
        c.retirar(500);
        assertEquals(200, c.getSaldo());
    }

    @Test
    void testTransferenciaExitosa() {
        Cuenta origen = new Cuenta();
        Cuenta destino = new Cuenta();
        origen.ingresar(500);
        destino.ingresar(50);
        origen.transferir(destino, 100);
        assertEquals(400, origen.getSaldo());
        assertEquals(150, destino.getSaldo());
    }

    @Test
    void testTransferenciaLimiteSuperado() {
        Cuenta origen = new Cuenta();
        Cuenta destino = new Cuenta();
        origen.ingresar(3500);
        destino.ingresar(50);
        origen.transferir(destino, 3000.01);
        assertEquals(3500, origen.getSaldo());
        assertEquals(50, destino.getSaldo());
    }
}