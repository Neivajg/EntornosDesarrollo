package main.java.passwordverify;

public class PasswordVerify {

    public static PasswordResult validate(String password) {

        String errores = "";

        if (password.length() < 8) {
            errores += "La contrasenya ha de tenir almenys 8 caràcters\n";
        }

        if (!tieneDosNumeros(password)) {
            errores += "La contrasenya ha de contenir almenys 2 números\n";
        }

        if (!tieneMayuscula(password)) {
            errores += "La contrasenya ha de contenir almenys una lletra majúscula\n";
        }

        if (!tieneEspecial(password)) {
            errores += "La contrasenya ha de contenir almenys un caràcter especial";
        }

        boolean valida = errores.isEmpty();

        return new PasswordResult(valida, errores.trim());
    }

    private static boolean tieneDosNumeros(String password) {
        int count = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) count++;
        }
        return count >= 2;
    }

    private static boolean tieneMayuscula(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) return true;
        }
        return false;
    }

    private static boolean tieneEspecial(String password) {
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) return true;
        }
        return false;
    }
}