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

        list.forEach((item) -> System.out.println(item));

        System.out.println("Sorted by name:");

        list.sort((item1, item2) -> {
           String name1 = item1.getAccountHolder().getName();
           String name2 = item2.getAccountHolder().getName();

           return name1.compareTo(name2);
        });

        list.forEach((item) -> System.out.println(item));

        System.out.println("Sorted by account balance:");

        Comparator<Account> comparator = (account1, account2) -> Double.compare(account1.getAccountBalance(), account2.getAccountBalance());

        Collections.sort(list, comparator);

        list.forEach((item) -> System.out.println(item));
    }
}