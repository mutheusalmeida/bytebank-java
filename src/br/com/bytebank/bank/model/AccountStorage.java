package br.com.bytebank.bank.model;

public class AccountStorage {
    private Object[] object;
    private int position;

    public AccountStorage(int length) {
        this.object = new Object[length];
        this.position = 0;
    }

    public void addAccount(Object object) {
        this.object[position] = object;
        this.position++;
    }

    public int getLength() {
        return this.position;
    }

    public Object getAccount(int position) {
        return this.object[position];
    }
}
