package br.com.bytebank.bank.model;

public class CheckingAccount extends Account implements Taxable {
    public CheckingAccount(Client client, int branch, int checkDigit, double accountBalance) {
        super(client, branch, checkDigit, accountBalance);
    }

    public void withdraw(double value) {
        double newValue = value + (value * 0.015);

        super.withdraw(newValue);
    }

    public boolean deposit(double value) {
        super.accountBalance += (value - 10);

        return true;
    }

    public double getTax() {
        return super.getAccountBalance() * 0.15;
    }

    @Override
    public String toString() {
        return "Checking account: " + super.toString();
    }

    @Override
    public int compareTo(Account account) {
        return Double.compare(this.getAccountBalance(), account.getAccountBalance());
    }
}
