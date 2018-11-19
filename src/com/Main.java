package com;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("bb");
        list.add("cc");
        list.add("aa");
        list.add("AA");
        list.add("ba");
        list.add("ÅÅ");

        Collator collator = Collator.getInstance();
        collator.setStrength(Collator.PRIMARY); // A=Å A=a
        collator.setStrength(Collator.SECONDARY);// A!=Å A=a
        collator.setStrength(Collator.TERTIARY);// A!=Å A!=a
        Collections.sort(list, collator);

        for (String s : list) {
            System.out.println(s);
        }


    }
}




















