package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new CheckingAccount(new Client("123.123.123-14"), 123, 1, 2000);
        acc1.getAccountHolder().setName("Bob");

        Account acc2 = new CheckingAccount(new Client("254.683.973-01"), 936, 7, 5000);
        acc2.getAccountHolder().setName("Ryan");

        Account acc3 = new CheckingAccount(new Client("018.865.320-24"), 255, 2, 70000);
        acc3.getAccountHolder().setName("Jeff");

        Account acc4 = new CheckingAccount(new Client("152.402.183-40"), 102, 8, 9000);
        acc4.getAccountHolder().setName("Smith");

        List<Account> list = new ArrayList<>();

        list.add(acc1);
        list.add(acc2);
        list.add(acc3);
        list.add(acc4);

        for (Account account : list) {
            System.out.println(account);
        }

        Collections.sort(list, new Comparator<Account>() {

            @Override
            public int compare(Account acc1, Account acc2) {
                String name1 = acc1.getAccountHolder().getName();
                String name2 = acc2.getAccountHolder().getName();

                return name1.compareTo(name2);
            }
        });

        System.out.println("Sorted by name:");

        for (Account account : list) {
            System.out.println((account));
        }
    }
}