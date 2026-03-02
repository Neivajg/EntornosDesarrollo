package es.iesmz;

import main.java.es.iesmz.TipoEmpleado;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmpleadoBRTest {

    @BeforeEach
    public void beforeEach() {
        System.out.println("EXECUTE PROVA");
    }

    // ============================
    // TEST CALCULA SALARIO NETO
    // ============================

    @Test
    public void testSalarioNeto2000() {
        assertEquals(1640f, es.iesmz.EmpleadoBR.calculaSalarioNeto(2000f), 0.01);
    }

    @Test
    public void testSalarioNeto1500() {
        assertEquals(1230f, es.iesmz.EmpleadoBR.calculaSalarioNeto(1500f), 0.01);
    }

    @Test
    public void testSalarioNeto1499_99() {
        assertEquals(1259.9916f, es.iesmz.EmpleadoBR.calculaSalarioNeto(1499.99f), 0.01);
    }

    @Test
    public void testSalarioNeto1250() {
        assertEquals(1050f, es.iesmz.EmpleadoBR.calculaSalarioNeto(1250f), 0.01);
    }

    @Test
    public void testSalarioNeto1000() {
        assertEquals(840f, es.iesmz.EmpleadoBR.calculaSalarioNeto(1000f), 0.01);
    }

    @Test
    public void testSalarioNeto999_99() {
        assertEquals(999.99f, es.iesmz.EmpleadoBR.calculaSalarioNeto(999.99f), 0.01);
    }

    @Test
    public void testSalarioNeto500() {
        assertEquals(500f, es.iesmz.EmpleadoBR.calculaSalarioNeto(500f), 0.01);
    }

    @Test
    public void testSalarioNeto0() {
        assertEquals(0f, es.iesmz.EmpleadoBR.calculaSalarioNeto(0f), 0.01);
    }

    @Test
    public void testSalarioNetoNegativo() {
        assertEquals(-1f, es.iesmz.EmpleadoBR.calculaSalarioNeto(-1f), 0.01);
    }

    // TEST CALCULA SALARIO BRUTO

    @Test
    public void testBrutoVenedor2000_8h() {
        assertEquals(1360f,
                es.iesmz.EmpleadoBR.calculaSalarioBruto(TipoEmpleado.venedor, 2000f, 8f),
                0.01);
    }

    @Test
    public void testBrutoVenedor1500_3h() {
        assertEquals(1260f,
                es.iesmz.EmpleadoBR.calculaSalarioBruto(TipoEmpleado.venedor, 1500f, 3f),
                0.01);
    }

    @Test
    public void testBrutoVenedor1499_99_0h() {
        assertEquals(1100f,
                es.iesmz.EmpleadoBR.calculaSalarioBruto(TipoEmpleado.venedor, 1499.99f, 0f),
                0.01);
    }

    @Test
    public void testBrutoEncarregat1250_8h() {
        assertEquals(1760f,
                es.iesmz.EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encarregat, 1250f, 8f),
                0.01);
    }

    @Test
    public void testBrutoEncarregat1000_0h() {
        assertEquals(1600f,
                es.iesmz.EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encarregat, 1000f, 0f),
                0.01);
    }

    @Test
    public void testBrutoEncarregat999_99_3h() {
        assertEquals(1560f,
                es.iesmz.EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encarregat, 999.99f, 3f),
                0.01);
    }

    @Test
    public void testBrutoEncarregat500_0h() {
        assertEquals(1500f,
                es.iesmz.EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encarregat, 500f, 0f),
                0.01);
    }

    @Test
    public void testBrutoEncarregat0_8h() {
        assertEquals(1660f,
                es.iesmz.EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encarregat, 0f, 8f),
                0.01);
    }

    @Test
    public void testBrutoVenedorVentasNegativas() {
        assertEquals(-1f,
                es.iesmz.EmpleadoBR.calculaSalarioBruto(TipoEmpleado.venedor, -1f, 8f),
                0.01);
    }

    @Test
    public void testBrutoVenedor1500_1h() {
        assertEquals(1220f,
                es.iesmz.EmpleadoBR.calculaSalarioBruto(TipoEmpleado.venedor, 1500f, 1f),
                0.01);
    }

    @Test
    public void testBrutoTipoNull() {
        assertEquals(-1f,
                es.iesmz.EmpleadoBR.calculaSalarioBruto(null, 1500f, 8f),
                0.01);
    }
}