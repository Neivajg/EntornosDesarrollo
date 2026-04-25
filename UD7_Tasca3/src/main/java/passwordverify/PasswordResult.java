package main.java.passwordverify;

public class PasswordResult {

    private boolean valid;
    private String message;

    public PasswordResult(boolean valid, String message) {
        this.valid = valid;
        this.message = message;
    }

    public boolean isValid() {
        return valid;
    }

    public String getMessage() {
        return message;
    }
}