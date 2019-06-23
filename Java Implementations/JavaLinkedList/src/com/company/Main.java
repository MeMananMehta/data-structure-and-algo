package com.company;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("jane","jones",123);
        Employee johnDoe = new Employee("john","doe",12);
        Employee marySmith = new Employee("mary","smith",12123);
        Employee mikeWilson = new Employee("mike","wilson",5435);
        Employee billGates = new Employee("bill","gates",1234);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);

        list.addLast(billGates);

        Iterator iter = list.iterator();

        System.out.print("HEAD -> ");
        while(iter.hasNext()){
         System.out.println(iter.next());
         System.out.print(" <=> ");
        }
        System.out.print("null");

    }
}
