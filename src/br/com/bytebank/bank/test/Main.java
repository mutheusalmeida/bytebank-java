package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CheckingAccount client = new CheckingAccount(new Client(), 123, 4, 4000);
        client.getAccountHolder().setName("Matheus");

        SavingAccount client2 = new SavingAccount(new Client(), 144, 5, 2000);
        client2.getAccountHolder().setName("Bob");

        ArrayList<Account> AccountStorage = new ArrayList<>(10);

        AccountStorage.add(client);
        AccountStorage.add(client2);

        for (Account account : AccountStorage) {
            System.out.println(account);
        }
    }
}