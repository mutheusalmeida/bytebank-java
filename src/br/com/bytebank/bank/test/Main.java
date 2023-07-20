package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Account acc = new CheckingAccount(new Client("930.040.303-14"), 123, 4, 4000);
        Account acc2 = new SavingAccount(new Client("120.026.194-04"), 122, 7, 2000);

        ArrayList<Account> accountsStorage = new ArrayList<>();

        accountsStorage.add(acc);

        boolean contains = accountsStorage.contains(acc2);

       if (!contains) {
           accountsStorage.add(acc2);
       }

       System.out.println(accountsStorage.size());
    }
}