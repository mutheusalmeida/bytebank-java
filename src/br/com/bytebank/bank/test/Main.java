package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.*;

public class Main {
    public static void main(String[] args) {
        CheckingAccount client = new CheckingAccount(new Client(), 123, 4, 4000);
        client.getAccountHolder().setName("Matheus");

        SavingAccount client2 = new SavingAccount(new Client(), 144, 5, 2000);
        client2.getAccountHolder().setName("Bob");

        System.out.println(client);
        System.out.println(client2);
    }
}