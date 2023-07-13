package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.*;

public class Main {
    public static void main(String[] args) {
        CheckingAccount client = new CheckingAccount(new Client(), 123, 4, 4000);
        client.getAccountHolder().setName("Matheus");
        StringBuilder fullName = new StringBuilder(client.getAccountHolder().getName());

        System.out.println(client.getAccountHolder().getName());

        fullName.append(" Almeida");
        fullName.append(" de");
        fullName.append(" Souza");

        client.getAccountHolder().setName(fullName.toString());

        System.out.println(client.getAccountHolder().getName());
    }
}