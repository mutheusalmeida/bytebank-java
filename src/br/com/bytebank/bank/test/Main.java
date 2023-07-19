package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CheckingAccount client = new CheckingAccount(new Client(), 123, 4, 4000);
        client.getAccountHolder().setName("Matheus");

        SavingAccount client2 = new SavingAccount(new Client(), 144, 5, 2000);
        client2.getAccountHolder().setName("Bob");

        ArrayList AccountStorage = new ArrayList();

        AccountStorage.add(client);
        AccountStorage.add(client2);

        System.out.println(AccountStorage.size());
        System.out.println(AccountStorage.get(1));

        AccountStorage.remove(1);

        System.out.println(AccountStorage.size());

        AccountStorage.add(client2);

        CheckingAccount acc = (CheckingAccount) AccountStorage.get(0);

        System.out.println(acc);

        System.out.println("---------------");

        for (Object clientAcc : AccountStorage) {
            System.out.println(clientAcc);
        }
    }
}