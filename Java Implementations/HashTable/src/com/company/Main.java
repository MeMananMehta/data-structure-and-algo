package com.company;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("jane","jones",12);
        Employee johnDoe = new Employee("john","doe",5345);
        Employee marySmith = new Employee("mary","smith",1324);
        Employee mikeWilson = new Employee("mike","wilson",154);
        Employee billEnd = new Employee("bill","end",13);

        SimpleHashTable ht = new SimpleHashTable();
        ht.put("jones", janeJones);
        ht.put("doe", johnDoe);
        ht.put("smith", marySmith);
        ht.put("wilson", mikeWilson);
        ht.put("end", billEnd);

        ht.printHashTable();




    }
}


