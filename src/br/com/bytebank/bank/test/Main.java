package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Account acc = new CheckingAccount(new Client("930.040.303-14"), 123, 4, 4000);
        Account acc2 = new SavingAccount(new Client("120.026.194-04"), 123, 4, 2000);

        boolean isEqual = acc.equals(acc2);

        System.out.println(isEqual);
    }
}