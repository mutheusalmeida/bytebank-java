package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Integer age = 24;
        int primitive = new Integer(27);

        List<Integer> list = new ArrayList<>();

        list.add(age);
        list.add(primitive);

        int item1 = list.get(0);
        Integer item2 = list.get(1);

        System.out.println(item1);
        System.out.println(item2);

        Integer valueReference = Integer.valueOf(24);
        int valuePrimitive = valueReference.intValue();

        Integer parsingReference = Integer.valueOf("90");
        int parsingPrimitive = Integer.parseInt("20");

        System.out.println(valuePrimitive);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
    }
}