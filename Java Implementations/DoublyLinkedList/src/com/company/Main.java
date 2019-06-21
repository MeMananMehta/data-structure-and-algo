package com.company;

public class Main {

    public static void main(String[] args){

        Employee janeJones = new Employee("jane","jones",123);
        Employee johnDoe = new Employee("john","doe",12);
        Employee marySmith = new Employee("mary","smith",12123);
        Employee mikeWilson = new Employee("mike","wilson",5435);

        EmpDoublyLinkedList list = new EmpDoublyLinkedList();

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.printList();

        Employee billGates = new Employee("bill","gates",1224);
        //list.addToEnd(billGates);
        //list.printList();
        //list.removeFromEnd();
        //list.removeFromFront();
        //list.printList();
        list.addBefore(billGates,mikeWilson);
        list.printList();

    }

}
