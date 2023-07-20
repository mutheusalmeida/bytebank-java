package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Account acc = new CheckingAccount(new Client("930.040.303-14"), 123, 4, 4000);
        Account acc2 = new SavingAccount(new Client("930.040.303-14"), 144, 5, 2000);

        if (acc.equals(acc2)) {
            System.out.println("Is equal");
        } else {
            System.out.println("Is not equal");
        }
    }
}