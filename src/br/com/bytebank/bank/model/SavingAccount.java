package br.com.bytebank.bank.model;

public class SavingAccount extends Account {
    public SavingAccount(Client client, int branch, int checkDigit, double accountBalance) {
        super(client, branch, checkDigit, accountBalance);
    }

    public boolean deposit(double value) {
        this.accountBalance += value;

        return true;
    }
}
