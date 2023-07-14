package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.*;

public class Main {
    public static void main(String[] args) {
        CheckingAccount client = new CheckingAccount(new Client(), 123, 4, 4000);
        client.getAccountHolder().setName("Matheus");

        SavingAccount client2 = new SavingAccount(new Client(), 144, 5, 2000);
        client2.getAccountHolder().setName("Bob");

        Account[] accounts = new Account[3];

        accounts[0] = client;
        accounts[1] = client2;

        System.out.println(accounts[0]);
    }
}