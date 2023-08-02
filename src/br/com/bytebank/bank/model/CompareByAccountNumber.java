package br.com.bytebank.bank.model;

import java.util.Comparator;

public class CompareByAccountNumber implements Comparator<Account> {

    @Override
    public int compare(Account acc1, Account acc2) {
        return Integer.compare(acc1.getBranch(), acc2.getBranch());
    }
}
