package br.com.bytebank.bank.model;

public class Administrator extends Employee implements Authenticated {
    private Authenticator authenticator;

    public Administrator(String name, int id, double compensation, String password) {
        super(name, id, compensation);
        this.authenticator = new Authenticator(password);
    }

    @Override
    public void setPassword(String password) {
        this.authenticator.setPassword(password);
    }

    public double getBonification() {
        return super.getCompensation();
    }

    @Override
    public String authenticate(String password) {
        return this.authenticator.authenticate(password);
    }
}
