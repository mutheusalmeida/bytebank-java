package br.com.bytebank.bank.model;

public class AccountStorage {
    private Account[] accounts;
    private int position;

    public AccountStorage(int length) {
        this.accounts = new Account[length];
        this.position = 0;
    }

    public void addAccount(Account account) {
        this.accounts[position] = account;
        this.position++;
    }

    public int getLength() {
        return this.position;
    }

    public Account getAccount(int position) {
        return this.accounts[position];
    }
}
