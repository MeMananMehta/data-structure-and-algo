package com.company;

public class Main {

    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue(10);

        queue.add(new Employee("Jane","Jones",12));
        queue.add(new Employee("John","Doe",97));
        queue.add(new Employee("Mary","Smith",78));
        queue.add(new Employee("Mike","Wilson",1342));
        queue.add(new Employee("Bill","Gates",324));

        queue.printQueue();
        queue.remove();
        queue.remove();
        queue.printQueue();

        System.out.print(queue.peek());

    }
}
