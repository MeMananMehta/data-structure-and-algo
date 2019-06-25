package com.company;

public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("jane","jones",123);
        Employee johnDoe = new Employee("john","doe",12);
        Employee marySmith = new Employee("mary","smith",12123);
        Employee mikeWilson = new Employee("mike","wilson",5435);

        EmpLinkedList list = new EmpLinkedList();

        System.out.println(list.isEmpty());
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.printList();
        System.out.println(list.getSize());

        list.removeFromFront();
        list.printList();
        }
}
