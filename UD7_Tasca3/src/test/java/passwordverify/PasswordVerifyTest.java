package test.java.passwordverify;

import main.java.passwordverify.PasswordResult;
import main.java.passwordverify.PasswordVerify;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordVerifyTest {

    @Test
    void passwordVacia() {

        PasswordResult result = PasswordVerify.validate("");

        assertFalse(result.isValid());
        assertEquals(
                "La contrasenya ha de tenir almenys 8 caràcters\n" +
                        "La contrasenya ha de contenir almenys 2 números\n" +
                        "La contrasenya ha de contenir almenys una lletra majúscula\n" +
                        "La contrasenya ha de contenir almenys un caràcter especial",
                result.getMessage()
        );
    }
    @Test
    void hola() {
        PasswordResult r = PasswordVerify.validate("hola");
        assertFalse(r.isValid());
        assertEquals(
                "La contrasenya ha de tenir almenys 8 caràcters\n" +
                        "La contrasenya ha de contenir almenys 2 números\n" +
                        "La contrasenya ha de contenir almenys una lletra majúscula\n" +
                        "La contrasenya ha de contenir almenys un caràcter especial",
                r.getMessage()
        );
    }

    @Test
    void holacaracola() {
        PasswordResult r = PasswordVerify.validate("holacaracola");
        assertFalse(r.isValid());
        assertEquals(
                "La contrasenya ha de contenir almenys 2 números\n" +
                        "La contrasenya ha de contenir almenys una lletra majúscula\n" +
                        "La contrasenya ha de contenir almenys un caràcter especial",
                r.getMessage()
        );
    }

    @Test
    void hola12() {
        PasswordResult r = PasswordVerify.validate("hola12");
        assertFalse(r.isValid());
        assertEquals(
                "La contrasenya ha de tenir almenys 8 caràcters\n" +
                        "La contrasenya ha de contenir almenys una lletra majúscula\n" +
                        "La contrasenya ha de contenir almenys un caràcter especial",
                r.getMessage()
        );
    }

    @Test
    void holA() {
        PasswordResult r = PasswordVerify.validate("holA");
        assertFalse(r.isValid());
        assertEquals(
                "La contrasenya ha de tenir almenys 8 caràcters\n" +
                        "La contrasenya ha de contenir almenys 2 números\n" +
                        "La contrasenya ha de contenir almenys un caràcter especial",
                r.getMessage()
        );
    }

    @Test
    void holaEspecial() {
        PasswordResult r = PasswordVerify.validate("hola!");
        assertFalse(r.isValid());
        assertEquals(
                "La contrasenya ha de tenir almenys 8 caràcters\n" +
                        "La contrasenya ha de contenir almenys 2 números\n" +
                        "La contrasenya ha de contenir almenys una lletra majúscula",
                r.getMessage()
        );
    }

    @Test
    void holaAEspecial() {
        PasswordResult r = PasswordVerify.validate("holaA!");
        assertFalse(r.isValid());
        assertEquals(
                "La contrasenya ha de tenir almenys 8 caràcters\n" +
                        "La contrasenya ha de contenir almenys 2 números",
                r.getMessage()
        );
    }

    @Test
    void hola12Especial() {
        PasswordResult r = PasswordVerify.validate("hola12!");
        assertFalse(r.isValid());
        assertEquals(
                "La contrasenya ha de tenir almenys 8 caràcters\n" +
                        "La contrasenya ha de contenir almenys una lletra majúscula",
                r.getMessage()
        );
    }

    @Test
    void hola12A() {
        PasswordResult r = PasswordVerify.validate("hola12A");
        assertFalse(r.isValid());
        assertEquals(
                "La contrasenya ha de tenir almenys 8 caràcters\n" +
                        "La contrasenya ha de contenir almenys un caràcter especial",
                r.getMessage()
        );
    }

    @Test
    void holacaracola12() {
        PasswordResult r = PasswordVerify.validate("holacaracola12");
        assertFalse(r.isValid());
        assertEquals(
                "La contrasenya ha de contenir almenys una lletra majúscula\n" +
                        "La contrasenya ha de contenir almenys un caràcter especial",
                r.getMessage()
        );
    }

    @Test
    void holacaracolaEspecial() {
        PasswordResult r = PasswordVerify.validate("holacaracola!");
        assertFalse(r.isValid());
        assertEquals(
                "La contrasenya ha de contenir almenys 2 números\n" +
                        "La contrasenya ha de contenir almenys una lletra majúscula",
                r.getMessage()
        );
    }

    @Test
    void holacaracolA() {
        PasswordResult r = PasswordVerify.validate("holacaracolA");
        assertFalse(r.isValid());
        assertEquals(
                "La contrasenya ha de contenir almenys 2 números\n" +
                        "La contrasenya ha de contenir almenys un caràcter especial",
                r.getMessage()
        );
    }

    @Test
    void cortoPeroValidoFormato() {
        PasswordResult r = PasswordVerify.validate("ho12A!");
        assertFalse(r.isValid());
        assertEquals(
                "La contrasenya ha de tenir almenys 8 caràcters",
                r.getMessage()
        );
    }

    @Test
    void faltaNumeros() {
        PasswordResult r = PasswordVerify.validate("holacaracolaA!");
        assertFalse(r.isValid());
        assertEquals(
                "La contrasenya ha de contenir almenys 2 números",
                r.getMessage()
        );
    }

    @Test
    void faltaMayuscula() {
        PasswordResult r = PasswordVerify.validate("holacaracola12!");
        assertFalse(r.isValid());
        assertEquals(
                "La contrasenya ha de contenir almenys una lletra majúscula",
                r.getMessage()
        );
    }

    @Test
    void faltaEspecial() {
        PasswordResult r = PasswordVerify.validate("holacaracola12A");
        assertFalse(r.isValid());
        assertEquals(
                "La contrasenya ha de contenir almenys un caràcter especial",
                r.getMessage()
        );
    }

    @Test
    void passwordValida1() {
        PasswordResult r = PasswordVerify.validate("holacaracola12A!");
        assertTrue(r.isValid());
        assertEquals("", r.getMessage());
    }

    @Test
    void passwordValida2() {
        PasswordResult r = PasswordVerify.validate("#P4blit0cl4v0uncl4vit0#");
        assertTrue(r.isValid());
        assertEquals("", r.getMessage());
    }
}