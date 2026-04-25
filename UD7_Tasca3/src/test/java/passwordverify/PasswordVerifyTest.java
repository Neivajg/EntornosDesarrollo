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
}