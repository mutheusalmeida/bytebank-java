package br.com.bytebank.bank.model;

import java.util.Comparator;

public class CompareByName implements Comparator<Account> {
    @Override
    public int compare(Account acc1, Account acc2) {
        String name1 = acc1.getAccountHolder().getName();
        String name2 = acc2.getAccountHolder().getName();

        return name1.compareTo(name2);
    }
}
