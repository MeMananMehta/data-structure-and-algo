package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedStack stack =  new LinkedStack();

        stack.push(new Employee("Jane","Jones",12));
        stack.push(new Employee("John","Doe",97));
        stack.push(new Employee("Mary","Smith",78));
        stack.push(new Employee("Mike","Wilson",1342));
        stack.push(new Employee("Bill","Gates",324));

        //stack.printStack();
        //System.out.println(stack.peek());

        System.out.println(stack.pop());
        stack.printStack();



    }
}
