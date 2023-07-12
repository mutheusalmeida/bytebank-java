package br.com.bytebank.bank.model;

import java.util.Objects;

public class Authenticator {
    private String password;

    public Authenticator(String password) {
        this.password = password;
    }

    // setters
    public void setPassword(String password) {
        this.password = password;
    }

    public String authenticate(String password) {
        if (Objects.equals(this.password, password)) {
            return "Login successful";
        }

        return "Login failed";
    }
}
